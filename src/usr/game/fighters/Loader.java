package usr.game.fighters;

public class Loader {
    public static void main(String[] args) {

        FirstFighter firstFighter = new FirstFighter("Richard", 120, 3);
        SecondFighter secondFighter = new SecondFighter("Tomy", 40, 8);

        fight(firstFighter, secondFighter);
    }

    private static void fight(FirstFighter firstFighter, SecondFighter secondFighter) {
        while (firstFighter.isAlive() && secondFighter.isAlive()) {
            firstFighter.setHealth(firstFighter.getHealth() - secondFighter.getPower());
            secondFighter.setHealth(secondFighter.getHealth() - firstFighter.getPower());
        }

        if (firstFighter.isAlive()) {
            System.out.println("The winner is: " + firstFighter.getName());
        } else if (secondFighter.isAlive()) {
            System.out.println("The winner is: " + secondFighter.getName());
        } else {
            System.out.println("Both is dead");
        }
    }
}
