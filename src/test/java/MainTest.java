import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    static class TestDice extends Dice {
        private int rollCount = 0;

        @Override
        public void roll() {
            rollCount++;
        }

        @Override
        public boolean isDouble() {
            return rollCount == 3;
        }

        @Override
        public int getDiceCount() {
            return rollCount;
        }
    }

    @Test
    public void testMainRollsUntilDouble() {
        Dice testDice = new TestDice();

        int tries = 0;
        while (true) {
            testDice.roll();
            tries++;
            if (testDice.isDouble()) {
                assertEquals(3, tries);
                assertEquals(3, testDice.getDiceCount());
                break;
            }
        }
    }
}
