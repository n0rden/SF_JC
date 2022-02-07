package usr.chess;


/**
 * � ������ Queen:
 * ���������� �����������, ������� ����� ��������� ���� ���� ������.
 * ���������� ����� getColor() ���, ����� �� ��������� ���� ������.
 * ���������� ����� canMoveToPosition() ���, ����� ������ �� ����� ����� �� ����� 
 * (����� � ����� ������ � ��� ��������� ������ �������� 8 �� 8, ����������, ��� �������
 * ���������� � 0) � ����� ������ ���, ��� ����� � �������� (�������� ����� � �� ���������
 * � �� ������), ����� ������ �� ����� ������� � �����,� ������� ��� ������ ���������. 
 * ���� ������ ����� ������ �� ����� (line, column) �� ����� (toLine, toColumn) �� ���� 
 * �������� (��������� ����), �� ������� ������ true, ����� � false.
 * ���������� ����� getSymbol ���, ����� �� ��������� ������ � ������ ������, ��� ����� - Q.
 */

public class Queen extends ChessPiece {

	public Queen(String color) {
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
			if (Math.abs(line - toLine) > 0 && Math.abs(column - toColumn) > 0 &&
					Math.abs(line - toLine) == Math.abs(column - toColumn) &&
					canMove(chessBoard, line, column, toLine, toColumn)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getSymbol() {
		return "Q";
	}
}