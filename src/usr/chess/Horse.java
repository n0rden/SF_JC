package usr.chess;


/**
 * � ������ Horse:
 * ���������� �����������, ������� ����� ��������� ���� ���� ������.
 * ���������� ����� getColor() ���, ����� �� ��������� ���� ������.
 * ���������� ����� canMoveToPosition() ���, ����� ���� �� ��� ����� �� �����
 * (����� � ����� ������ � ��� ��������� ������ �������� 8 �� 8, ����������, ���
 * ������� ���������� � 0) � ��� ������ ������ ������ �û. ����� ������ �� �����
 * ������� � �����, � ������� ��� ������ ���������. ���� ���� ����� ������ ��
 * ����� (line, column) �� ����� (toLine, toColumn) �� ���� �������� (��������� ����),
 * �� ������� ������ true, ����� � false.
 * ���������� ����� getSymbol ���, ����� �� ��������� ������ ������, � ����� ������ ���� � ���  H.
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