package usr.chess;

/**
 * ����� ����������� � �������� ��������� ������������:
 * ��������� ���������� color � ����;
 * ���������� ���������� check, �� ��������� true, ��� ����������� ��� ������ �����;
 * �����������, ����������� � ���� ��������� ���������� color.
 * � ��������� ��������� (public) ������:
 * ����������� ����� getColor(), ������������ ������ � ������ ������� ���� ������;
 * ����������� ����� canMoveToPosition(), ������������ ���������� (boolean) ��������
 * � ������������ � ���� ��������� ChessBoard chessBoard, int line, int column, int toLine, int toColumn;
 * ����������� ����� getSymbol(), ������������ ������ � ��� ������.
 */

public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public static boolean canMove(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(chessBoard.board[line][column].getColor()))
            return false;

        // pawn attack
        if (chessBoard.board[line][column].getSymbol().equals("P")) {
            if (chessBoard.board[line][column].getColor().equals("White")) {
                if (toLine - line == 1 && Math.abs(toColumn - column) == 1) {
                    return true;
                }
            }

            if (chessBoard.board[line][column].getColor().equals("Black")) {
                if (toLine - line == -1 && Math.abs(toColumn - column) == 1) {
                    return true;
                }
            }
        }

        // forward
        if (column == toColumn && toLine > line) {
            for (int i = 1; i <= Math.abs(toLine - line); i++) {
                if (chessBoard.board[line + i][toColumn] != null) {
                    return false;
                }
            }
        }

        // back
        if (column == toColumn && toLine < line) {
            for (int i = 1; i <= Math.abs(toLine - line); i++) {
                if (chessBoard.board[line - i][toColumn] != null) {
                    return false;
                }
            }
        }

        // right
        if (line == toLine && toColumn > column) {
            for (int i = 1; i <= Math.abs(toColumn - column); i++) {
                if (chessBoard.board[toLine][column + i] != null) {
                    return false;
                }
            }
        }

        // left
        if (line == toLine && toColumn < column) {
            for (int i = 1; i <= Math.abs(toColumn - column); i++) {
                if (chessBoard.board[toLine][column - i] != null) {
                    return false;
                }
            }
        }

        if (Math.abs(toLine - line) == Math.abs(toColumn - column)) {
            if (toLine > line && toColumn > column) {
                for (int i = 1; i <= Math.abs(toColumn - column); i++) {
                    if (chessBoard.board[line + i][column + i] != null) {
                        return false;
                    }
                }
            }

            if (toLine < line && toColumn < column) {
                for (int i = 1; i <= Math.abs(toColumn - column); i++) {
                    if (chessBoard.board[line - i][column - i] != null) {
                        return false;
                    }
                }
            }

            if (toLine > line && toColumn < column) {
                for (int i = 1; i <= Math.abs(toColumn - column); i++) {
                    if (chessBoard.board[line + i][column - i] != null) {
                        return false;
                    }
                }
            }

            if (toLine < line && toColumn > column) {
                for (int i = 1; i <= Math.abs(toColumn - column); i++) {
                    if (chessBoard.board[line - i][column + i] != null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public abstract String getColor();

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();
}