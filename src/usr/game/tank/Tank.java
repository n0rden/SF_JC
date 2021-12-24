package usr.game.tank;

public class Tank {

    private int vertPosition;
    private int horPosition;
    private int fuel;
    private byte direction;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int vertPosition, int horPosition) {
        this(vertPosition, horPosition, 100);
    }

    public Tank(int vertPosition, int horPosition, int fuel) {
        this.vertPosition = vertPosition;
        this.horPosition = horPosition;
        this.fuel = fuel;
    }

    public void goForward(int offset) {

        if (offset >= 0) {
            if (fuel >= offset) {
                fuel -= offset;
            } else {
                offset = fuel;
                fuel = 0;
            }
        } else {
            offset = offset * (-1);
            if (fuel >= offset)  {
                fuel -= offset;
            } else {
                offset = fuel * (-1);
                fuel = 0;
            }
        }

        if (direction == 0) vertPosition += offset;
        else if (direction == 1) horPosition += offset;
        else if (direction == 2) vertPosition -= offset;
        else horPosition -= offset;
    }

    public void goBackward(int offset) {
        goForward(-offset);
    }

    public void turnRight() {
        direction++;
        if (direction == 4) direction = 0;
    }

    public void turnLeft() {
        direction--;
        if (direction == -1) direction = 3;
    }

    public void printPosition() {
        System.out.printf("The Tank is at %d, %d now.\n", this.vertPosition, this.horPosition);
    }

    public int getFuel() {
        return fuel;
    }
}
