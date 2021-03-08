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
		setPiece(0, 0, new Rook(PieceColour.BLACK));
		setPiece(0, 1, new Knight(PieceColour.BLACK));
		setPiece(0, 2, new Bishop(PieceColour.BLACK));
		setPiece(0, 3, new Queen(PieceColour.BLACK));
		setPiece(0, 4, new King(PieceColour.BLACK));
		setPiece(0, 5, new Bishop(PieceColour.BLACK));
		setPiece(0, 6, new Knight(PieceColour.BLACK));
		setPiece(0, 7, new Rook(PieceColour.BLACK));
		for (int i = 0; i < 8; i++)
		{
			setPiece(1, i, new Pawn(PieceColour.BLACK));
		}
		for (int i = 0; i < 8; i++)
		{
			setPiece(6, i, new Pawn(PieceColour.WHITE));
		}
		setPiece(7, 0, new Rook(PieceColour.WHITE));
		setPiece(7, 1, new Knight(PieceColour.WHITE));
		setPiece(7, 2, new Bishop(PieceColour.WHITE));
		setPiece(7, 3, new Queen(PieceColour.WHITE));
		setPiece(7, 4, new King(PieceColour.WHITE));
		setPiece(7, 5, new Bishop(PieceColour.WHITE));
		setPiece(7, 6, new Knight(PieceColour.WHITE));
		setPiece(7, 7, new Rook(PieceColour.WHITE));
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
		if (p instanceof King)
		{
			board[i1][j1].setPiece(board[i0][j0].getPiece());
			board[i0][j0].removePiece();
			return true;
		}
		board[i1][j1].setPiece(board[i0][j0].getPiece());
		board[i0][j0].removePiece();
		return false;
	}

	public static void setPiece(int iIn, int jIn, Piece p)
	{
		board[iIn][jIn].setPiece(p);
	}

	public static Piece getPiece(int iIn, int jIn)
	{
		return board[iIn][jIn].getPiece();
	}
	
	public static boolean hasPiece(int i, int j)
	{		
		if (getPiece(i, j) == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
