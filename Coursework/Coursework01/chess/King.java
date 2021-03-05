package chess;

public class King extends Piece
{
	public King(PieceColour newColour)
	{
		if (newColour == PieceColour.BLACK)
		{
			colour = newColour;
			setSymbol("\u0265A");
		}
		else if (newColour == PieceColour.WHITE)
		{
			colour = newColour;
			setSymbol("\u02654");
		}
		else
		{
			System.out.println("Logic Error - King Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		return false;
	}
}
