package usr.chess;


/**
 * В классе Pawn:
 * Реализуйте конструктор, который будет принимать цвет фигуры.
 * Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
 * Реализуйте метод canMoveToPosition() так, чтобы пешка не могла выйти за доску и могла ходить только вперед.
 * Помните, что первый ход пешка может сдвинуться на 2 поля вперед, сделать это можно, например, сравнив координаты.
 * То есть, если пешка белая (color.equals("White")) и находится в line == 1, то она может пойти на 2 поля вперед,
 * иначе — нет, аналогично с черными пешками. Также фигура не может сходить в точку, в которой она сейчас находится.
 * Если пешка может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше),
 * то функция вернет true, иначе — false.
 * Реализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае пешка — это P.
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