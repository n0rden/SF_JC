package usr.chess;


public class testChess {

	public static void main(String[] args) {
		ChessBoard chessBoard = new ChessBoard("white");
		chessBoard.board[0][1] = new Horse("White");
		System.out.println(chessBoard.board[0][1]);
	}
}
