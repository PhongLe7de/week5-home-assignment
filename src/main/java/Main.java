public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        while(true) {
            dice.roll();
            if(dice.isDouble()) {
                System.out.println("You rolled a double!");
                System.out.printf("After %d try both reach the same value", dice.getDiceCount());
                break;
            } else {
                System.out.println("Try again.");
            }
        }

    }
}
