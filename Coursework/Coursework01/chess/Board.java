package chess;

public class Board
{
	private static Square[][] board = new Square[8][8];

	public static void initialiseBoard()
	{
		for (int i = 0; i < board[0].length; i++)
		{
			for (int j = 0; j < board[1].length; j++)
				board[i][j] = new Square();
		}		
	}
    
	// REQUIRES WORK
	public static void initialisePieces()
	{
		board.setPiece(0, 0, new Rook(PieceColour.BLACK));
		// board.setPiece(1, 0, new Knight(PieceColour.BLACK));
		// board.setPiece(2, 0, new Bishop(PieceColour.BLACK));
		// board.setPiece(3, 0, new Queen(PieceColour.BLACK));
		// board.setPiece(4, 0, new King(PieceColour.BLACK));
		// board.setPiece(5, 0, new Bishop(PieceColour.BLACK));
		// board.setPiece(6, 0, new Knight(PieceColour.BLACK));
		// board.setPiece(7, 0, new Rook(PieceColour.BLACK));
		// for (int i = 0; i < 7; i++)
		// {
		// 	board.setPiece(i, 1, new Pawn(PieceColour.BLACK));
		// }
		// for (int i = 0; i < 7; i++)
		// {
		// 	board.setPiece(i, 6, new Pawn(PieceColour.WHITE));
		// }
		// board.setPiece(0, 7, new Rook(PieceColour.WHITE));
		// board.setPiece(1, 7, new Knight(PieceColour.WHITE));
		// board.setPiece(2, 7, new Bishop(PieceColour.WHITE));
		// board.setPiece(3, 7, new Queen(PieceColour.WHITE));
		// board.setPiece(4, 7, new King(PieceColour.WHITE));
		// board.setPiece(5, 7, new Bishop(PieceColour.WHITE));
		// board.setPiece(6, 7, new Knight(PieceColour.WHITE));
		// board.setPiece(7, 7, new Rook(PieceColour.WHITE));
	}
	
	public static void printBoard()
	{
		System.out.print("\n  a b c d e f g h \n");
		System.out.print("  -----------------\n");		
		for (int i = 0; i < board[0].length; i++)
		{
			int row=i+1;
				for (int j = 0; j < board[1].length; j++)
				{
					if ((j == 0) && Board.hasPiece(i,j))
					{
						System.out.print(row + " " + Board.getPiece(i,j).getSymbol());	
					}
					else if ((j == 0) && !Board.hasPiece(i,j))
					{
						System.out.print(row + "  " );
					}
					else if (Board.hasPiece(i,j))
					{					
						System.out.print("|" + Board.getPiece(i,j).getSymbol());					
					}
					else
					{
						System.out.print("| ");		
					}
				}				
				System.out.print("  " + row + "\n");
		}
		System.out.print("  -----------------");
		System.out.print("\n  a b c d e f g h \n");	
	}
	
	// REQUIRES WORK	
	public static boolean movePiece(int i0, int j0, int i1, int j1, Piece p)
	{
		
		return false;
	}

	public static void setPiece(int iIn, int jIn, Piece p)
	{
		board[iIn][jIn].setPiece(p);
	}
	
	// REQUIRES WORK
	public static Piece getPiece(int iIn, int jIn)
	{
		return board[iIn][jIn].getPiece();
	}
	
	// REQUIRES WORK
	public static boolean hasPiece(int i, int j)
	{		
		if (board[i][j].getPiece() == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
