import java.util.Arrays;

public class TicTacToe {

    private String[][] field;
    private String player;
    private String winner;
    boolean gameOver = false;
    int freeFields = 9;

    public TicTacToe() {
        newGame();
        for (String[] str : field) {
            System.out.println(Arrays.toString(str));
        }
    }

    public void newGame() {
        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        player = "X";
    }

    public String[][] getField() {
        return field;
    }

    public String checkGame() {
        switch (winner) {
            case "X":
                return "X";
            case "0":
                return "0";
            case "D":
                return "D";
            default:
                return null;
        }
    }

    public String makeMove(int x, int y) {
        x = x - 1;
        y = y - 1;

        while (!gameOver || freeFields != 0) {
            if (freeFields != 0) {
                if (field[x][y].equals("-")) {
                    field[x][y] = player;
                    freeFields--;
                    player = freeFields % 2 == 0 ? "0" : "X";

                    for (String[] str : field) {
                        System.out.println(Arrays.toString(str));
                    }

                    if (field[0][0].equals(player) && field[1][0].equals(player) && field[2][0].equals(player) ||
                            field[0][1].equals(player) && field[1][1].equals(player) && field[2][1].equals(player) ||
                            field[0][2].equals(player) && field[1][2].equals(player) && field[2][2].equals(player) ||
                            field[0][0].equals(player) && field[0][1].equals(player) && field[0][2].equals(player) ||
                            field[1][0].equals(player) && field[1][1].equals(player) && field[1][2].equals(player) ||
                            field[2][0].equals(player) && field[2][1].equals(player) && field[2][2].equals(player) ||
                            field[0][0].equals(player) && field[1][1].equals(player) && field[2][2].equals(player) ||
                            field[0][2].equals(player) && field[1][1].equals(player) && field[2][0].equals(player)) {
                        winner = player;
                        gameOver = true;
                        return "Player " + winner + " won";
                    }
                    return "Move completed";
                } else {
                    return "Cell " + x + ", " + y + " is already occupied";
                }
            } else {
                winner = "D";
                gameOver = true;
                return winner;
            }
        }
        return null;
    }
}
