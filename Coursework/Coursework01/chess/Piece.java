package chess;

public abstract class Piece
{
	private String symbol;
	protected PieceColour colour;

	public String getSymbol()
	{
		return symbol;
	}

	public void setSymbol(String newSymbol)
	{
		symbol = newSymbol;
	}

	public PieceColour getColour()
	{
		return colour;
	}

	public abstract boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		return false;
	}
}

