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
		hasPiece = true;
	}

	public void removePiece()
	{
		p = null;
		hasPiece = false;
	}

	public boolean hasPiece()
	{
		return hasPiece;
	}
}
