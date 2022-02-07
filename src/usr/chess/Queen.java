package usr.chess;


/**
 * В классе Queen:
 * Реализуйте конструктор, который будет принимать лишь цвет фигуры.
 * Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
 * Реализуйте метод canMoveToPosition() так, чтобы фигуры не могли выйти за доску 
 * (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что индексы
 * начинаются с 0) и могли ходить так, как ходят в шахматах (Королева ходит и по диагонали
 * и по прямой), также фигура не может сходить в точку,в которой она сейчас находится. 
 * Если фигура может пройти от точки (line, column) до точки (toLine, toColumn) по всем 
 * правилам (указанным выше), то функция вернет true, иначе — false.
 * Реализуйте метод getSymbol так, чтобы он возвращал строку — символ фигуры, для ферзя - Q.
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