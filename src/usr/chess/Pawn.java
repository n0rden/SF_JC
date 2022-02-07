package usr.chess;

/**
 * � ������ Pawn:
 * ���������� �����������, ������� ����� ��������� ���� ������.
 * ���������� ����� getColor() ���, ����� �� ��������� ���� ������.
 * ���������� ����� canMoveToPosition() ���, ����� ����� �� ����� ����� �� ����� � ����� ������ ������ ������.
 * �������, ��� ������ ��� ����� ����� ���������� �� 2 ���� ������, ������� ��� �����, ��������, ������� ����������.
 * �� ����, ���� ����� ����� (color.equals("White")) � ��������� � line == 1, �� ��� ����� ����� �� 2 ���� ������,
 * ����� � ���, ���������� � ������� �������. ����� ������ �� ����� ������� � �����, � ������� ��� ������ ���������.
 * ���� ����� ����� ������ �� ����� (line, column) �� ����� (toLine, toColumn) �� ���� �������� (��������� ����),
 * �� ������� ������ true, ����� � false.
 * ���������� ����� getSymbol ���, ����� �� ��������� ������ ������, � ����� ������ ����� � ��� P.
 */

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (color.equals("White") && this.check) {
                if (toLine - line <= 2 && canMove(chessBoard, line, column, toLine, toColumn)) {
                    return true;
                } else if (color.equals("White") && toLine - line <= 2 &&
                        canMove(chessBoard, line, column, toLine, toColumn)) return true;
            } else if (color.equals("Black") && this.check) {
                if (line - toLine <= 2 &&
                        canMove(chessBoard, line, column, toLine, toColumn)) {
                    return true;
                } else if (color.equals("Black") && line - toLine <= 2 &&
                        canMove(chessBoard, line, column, toLine, toColumn)) return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}