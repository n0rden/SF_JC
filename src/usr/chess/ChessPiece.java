package usr.chess;

/**
 * Класс абстрактный и содержит следующие перемененные:
 * строковая переменная color — цвет;
 * логическая переменная check, по умолчанию true, она понадобится нам сильно позже;
 * конструктор, принимающий в себя строковую переменную color.
 * И следующие публичные (public) методы:
 * абстрактный метод getColor(), возвращающий строку — должен вернуть цвет фигуры;
 * абстрактный метод canMoveToPosition(), возвращающий логическое (boolean) значение 
 * и паринимающий в себя параметры ChessBoard chessBoard, int line, int column, int toLine, int toColumn;
 * абстрактный метод getSymbol(), возвращающий строку — тип фигуры.
 */

public abstract class ChessPiece {
	String color;
	boolean check = true;
	
	public ChessPiece (String color) {
		this.color = color;
	}
	
	public abstract String getColor();
	public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
	public abstract String getSymbol();
}
