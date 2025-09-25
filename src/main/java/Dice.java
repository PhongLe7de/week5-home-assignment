public class Dice {
    private static int diceCount = 0;
    private Integer die1;
    private Integer die2;

    public Dice() {
        this.die1 = 1;
        this.die2 = 1;
    }

    public void roll() {
        this.die1 = (int) (Math.random() * 6) + 1;
        this.die2 = (int) (Math.random() * 6) + 1;
        diceCount++;
    }

    public boolean isDouble() {
        return die1.equals(die2);
    }

    public int getDiceCount() {
        return diceCount;
    }

    public Integer getDie1() {
        return die1;
    }
    public Integer getDie2() {
        return die2;
    }
}
