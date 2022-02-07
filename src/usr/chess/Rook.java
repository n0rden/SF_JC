package usr.chess;


/**
 * � ������ Rook:
 * ���������� ����� getColor() ���, ����� �� ��������� ���� ������.
 * ���������� ����� canMoveToPosition() ���, ����� ����� �� ����� �����
 * �� ����� (����� � ����� ������ � ��� ��������� ������ �������� 8 �� 8,
 * ����������, ��� ������� ���������� � 0) � ��� ������ ������ �� ������,
 * ����� ������ �� ����� ������� � �����, � ������� ��� ������ ���������.
 * ���� ����� ����� ������ �� ����� (line, column) �� ����� (toLine, toColumn)
 * �� ���� �������� (��������� ����), �� ������� ������ true, ����� � false.
 * ���������� ����� getSymbol ���, ����� �� ��������� ������ ������, � ����� ������ ����� � R.
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