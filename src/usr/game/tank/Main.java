package usr.game.tank;

public class Main {
    public static void main(String[] args) {

        // At (0;0) fuel=100
        AmphibiTank justTank = new AmphibiTank();
        // At (10;20) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-300);
        anywareTank.printPosition();
        customTank.goForward(150);
        customTank.printPosition();
        customTank.turnLeft();
        customTank.goForward(51);
        customTank.printPosition();
        customTank.goForward(51);
        customTank.printPosition();
        customTank.goForward(51);
        customTank.printPosition();
        justTank.swim();
    }
}
