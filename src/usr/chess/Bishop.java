package usr.chess;

/**
 * � ������ Bishop:
 * ���������� ����� getColor() ���, ����� �� ��������� ���� ������.
 * ���������� ����� canMoveToPosition() ���, ����� ���� �� ��� �����
 * �� ����� (����� � ����� ������ � ��� ��������� ������ �������� 8 �� 8,
 * ����������, ��� ������� ���������� � 0) � ��� ������ ������ �� ���������,
 * ����� ������ �� ����� ������� � �����, � ������� ��� ������ ���������.
 * ���� ���� ����� ������ �� ����� (line, column) �� ����� (toLine, toColumn)
 * �� ���� �������� (��������� ����), �� ������� ������ true, ����� � false.
 * ���������� ����� getSymbol ���, ����� �� ��������� ������ ������, � ����� ������ ���� �  B.
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