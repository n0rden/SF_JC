package usr.chess;

/**
 * ¬ классе Bishop:
 * –еализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
 * –еализуйте метод canMoveToPosition() так, чтобы слон не мог выйти
 * за доску (доска в нашем случае Ч это двумерный массив размером 8 на 8,
 * напоминаем, что индексы начинаютс€ с 0) и мог ходить только по диагонали,
 * также фигура не может сходить в точку, в которой она сейчас находитс€.
 * ≈сли слон может пройти от точки (line, column) до точки (toLine, toColumn)
 * по всем правилам (указанным выше), то функци€ вернет true, иначе Ч false.
 * –еализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае слон Ч  B.
 */

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line != toLine && column != toColumn && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (Math.abs(line - toLine) == Math.abs(column - toColumn) &&
                    canMove(chessBoard, line, column, toLine, toColumn)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}