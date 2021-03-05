package chess;

public class Square
{
	private boolean hasPiece;
	private Piece p;
	
	public Square()
	{
		hasPiece = false;
		p = null;
	}

	public Piece getPiece()
	{
		return p;
	}

	public void setPiece(Piece newP)
	{
		p = newP;
	}

	// REQUIRES WORK
	public void removePiece()
	{
		
	}

	public boolean hasPiece()
	{
		return hasPiece;
	}
}
