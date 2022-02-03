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
		if (line != toLine && column == toColumn && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
			if (color.equals("White") && line == 1) {
				if (toLine - line <= 2) {
					return true;
				}
			} else if (color.equals("Black") && line == 6) {
				if (line - toLine <= 2) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String getSymbol() {
		return "P";
	}
}