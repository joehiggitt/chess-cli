package chess;

public class Queen extends Piece
{
	public Queen(PieceColour newColour)
	{
		if (newColour == PieceColour.BLACK)
		{
			colour = newColour;
			setSymbol("\u0265B");
		}
		else if (newColour == PieceColour.WHITE)
		{
			colour = newColour;
			setSymbol("\u02655");
		}
		else
		{
			System.out.println("Logic Error - Queen Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		return false;
	}
}
