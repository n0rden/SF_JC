package usr.chess;


/**
 * В классе Horse:
 * Реализуйте конструктор, который будет принимать лишь цвет фигуры.
 * Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
 * Реализуйте метод canMoveToPosition() так, чтобы конь не мог выйти за доску
 * (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что
 * индексы начинаются с 0) и мог ходить только буквой «Г». Также фигура не может
 * сходить в точку, в которой она сейчас находится. Если конь может пройти от
 * точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше),
 * то функция вернет true, иначе — false.
 * Реализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае конь — это  H.
 */

public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (line != toLine && column != toColumn && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (Math.abs(toLine - line) == 2 || Math.abs(toColumn - column) == 2) {
                if (Math.abs(toLine - line) == 1 || Math.abs(toColumn - column) == 1) {
                    if (chessBoard.board[toLine][toColumn] == null ||
                            !chessBoard.board[toLine][toColumn].getColor().equals(this.color)) return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}