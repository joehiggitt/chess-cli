package chess;

public class Pawn extends Piece
{
	public Pawn(PieceColour newColour)
	{
		if (newColour == PieceColour.BLACK)
		{
			colour = newColour;
			setSymbol("\u0265F");
		}
		else if (newColour == PieceColour.WHITE)
		{
			colour = newColour;
			setSymbol("\u02659");
		}
		else
		{
			System.out.println("Logic Error - Pawn Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		return false;
	}
}