package usr.chess;


/**
 * � ������ King:
* ���������� �����������, ������� ����� ��������� ���� ���� ������.
* ���������� ����� getColor() ���, ����� �� ��������� ���� ������.
* ���������� ����� canMoveToPosition() ���, ����� ������ �� ����� ����� �� ����� 
* (����� � ����� ������ � ��� ��������� ������ �������� 8 �� 8, ����������, ��� �������
* ���������� � 0) � ����� ������ ���, ��� ����� � �������� (������ � � ����� ���� ������ ����), 
* ����� ������ �� ����� ������� � �����,� ������� ��� ������ ���������. 
* ���� ������ ����� ������ �� ����� (line, column) �� ����� (toLine, toColumn) �� ���� 
* �������� (��������� ����), �� ������� ������ true, ����� � false.
* ���������� ����� getSymbol ���, ����� �� ��������� ������ � ������ ������, ��� ������ - K.
* �������� � ������ King �������� ����� isUnderAttack(ChessBoard board, int line, int column), 
* ������������ ���������� (boolean) ��������, �������  ����� ���������, ��������� �� ����, 
* �� ������� ����� ������ (��� ���� ���������� �����) ��� ������. ���� ��� ���, �� ����� ������ 
* ������� true, ����� � false. ��� �������� ��� ��������� ����.
*/

public class King extends ChessPiece {

	public King(String color) {
		super(color);
	}

	/*
	 * �������� ����: ��������� ������ � ��������������� ������, ��������� � ���
	 * �������� line � column �� ������ isUnderAttack ������. ���� ������ �����
	 * ������ �� ������ �����������, �� ���, ����� ���.
	 */

	public boolean isUnderAttack(ChessBoard board, int line, int column) {
		for (int i = 0; i < board.board.length; i++) {
			for (int j = 0; j < board.board[0].length; j++) {
				if (board.board[i][j] != null && !this.getColor().equals(board.board[i][j].getColor())) {
					if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
		if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
			if ((Math.abs(line - toLine) == 1 && column == toColumn ||
					Math.abs(column - toColumn) == 1 && line == toLine ||
					Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 1) &&
					canMove(chessBoard, line, column, toLine, toColumn)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getSymbol() {
		return "K";
	}
}