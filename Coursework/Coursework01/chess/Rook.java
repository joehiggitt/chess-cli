package chess;

public class Rook extends Piece
{
	public Rook(PieceColour newColour)
	{
		if (newColour == PieceColour.BLACK)
		{
			colour = newColour;
			setSymbol("\u0265C");
		}
		else if (newColour == PieceColour.WHITE)
		{
			colour = newColour;
			setSymbol("\u02656");
		}
		else
		{
			System.out.println("Logic Error - Rook Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		return false;
	}
}
