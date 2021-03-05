package chess;

public class Square
{
	private boolean hasPiece;
	private Piece p;
	
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
