package chess;

public class Bishop extends Piece
{
	public Bishop(PieceColour newColour)
	{
		if (newColour == PieceColour.BLACK)
		{
			colour = newColour;
			setSymbol("\u0265D");
		}
		else if (newColour == PieceColour.WHITE)
		{
			colour = newColour;
			setSymbol("\u02657");
		}
		else
		{
			System.out.println("Logic Error - Bishop Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		return false;
	}
}
