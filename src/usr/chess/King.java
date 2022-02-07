package usr.chess;


/**
 * В классе King:
* Реализуйте конструктор, который будет принимать лишь цвет фигуры.
* Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
* Реализуйте метод canMoveToPosition() так, чтобы фигуры не могли выйти за доску 
* (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что индексы
* начинаются с 0) и могли ходить так, как ходят в шахматах (Король — в любое поле вокруг себя), 
* также фигура не может сходить в точку,в которой она сейчас находится. 
* Если фигура может пройти от точки (line, column) до точки (toLine, toColumn) по всем 
* правилам (указанным выше), то функция вернет true, иначе — false.
* Реализуйте метод getSymbol так, чтобы он возвращал строку — символ фигуры, для короля - K.
* Отдельно в классе King создайте метод isUnderAttack(ChessBoard board, int line, int column), 
* возвращающий логическое (boolean) значение, который  будет проверять, находится ли поле, 
* на котором стоит король (или куда собирается пойти) под атакой. Если это так, то метод должен 
* вернуть true, иначе — false. Это позволит нам проверять шахи.
*/

public class King extends ChessPiece {

	public King(String color) {
		super(color);
	}

	/*
	 * Проверка шаха: проверяем фигуры с противоположным цветом, передавая в них
	 * значения line и column из метода isUnderAttack короля. Если фигура может
	 * прийти по данным координатам, то шах, иначе нет.
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