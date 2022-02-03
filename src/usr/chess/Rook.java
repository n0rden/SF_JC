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

        int count = 0;

        if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (Math.abs(line - toLine) > 0 && column == toColumn) {
                if (line < toLine) {
                    for (int i = 1; i <= toLine - line; i++) {
                        if (chessBoard.board[line + i][column] == null) {
                            count++;
                            if (count == toLine - line) {
                                return true;
                            }
                        } else if (chessBoard.board[line + i][column].getColor() != this.color) {
                            toLine = line + i;
                            return true;
                        }
                    }
                } else {
                    for (int j = 1; j <= line - toLine; j++) {
                        if (chessBoard.board[line - j][column] == null) {
                            count++;
                            if (count == line - toLine) {
                                return true;
                            }
                        } else if (chessBoard.board[line - j][column].getColor() != this.color) {
                            toLine = line - j;
                            return true;
                        }
                        return true;
                    }
                }
            }

            if (Math.abs(column - toColumn) > 0 && line == toLine) {
                if (column < toColumn) {
                    for (int i = 1; i <= toColumn - column; i++) {
                        if (chessBoard.board[column + i][line] == null) {
                            count++;
                            if (count == line - toLine) {
                                return true;
                            }
                        } else if (chessBoard.board[column + i][line].getColor() != this.color) {
                            toColumn = column + i;
                            return true;
                        }
                        return true;
                    }
                } else {
                    for (int j = 1; j <= column - toColumn; j++) {
                        if (chessBoard.board[column - j][line] == null) {
                            count++;
                            if (count == line - toLine) {
                                return true;
                            }
                        } else if (chessBoard.board[column - j][line].getColor() != this.color) {
                            toColumn = column - j;
                            return true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}