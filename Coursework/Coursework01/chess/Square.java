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

	public void removePiece()
	{
		setPiece(null);
	}

	public boolean hasPiece()
	{
		return hasPiece;
	}
}
