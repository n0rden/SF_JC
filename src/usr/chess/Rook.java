package usr.chess;


/**
 * ¬ классе Rook:
 * –еализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
 * –еализуйте метод canMoveToPosition() так, чтобы ладь€ не могла выйти
 * за доску (доска в нашем случае Ч это двумерный массив размером 8 на 8,
 * напоминаем, что индексы начинаютс€ с 0) и мог ходить только по пр€мой,
 * также фигура не может сходить в точку, в которой она сейчас находитс€.
 * ≈сли ладь€ может пройти от точки (line, column) до точки (toLine, toColumn)
 * по всем правилам (указанным выше), то функци€ вернет true, иначе Ч false.
 * –еализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае ладь€ Ч R.
 */

public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if ((Math.abs(line - toLine) > 0 && column == toColumn ||
                    Math.abs(column - toColumn) > 0 && line == toLine) &&
                    canMove(chessBoard, line, column, toLine, toColumn)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}