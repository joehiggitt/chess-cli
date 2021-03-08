package chess;

public class Pawn extends Piece
{
	public Pawn(PieceColour newColour)
	{
		super(newColour);
		switch(newColour)
		{
			case BLACK:
				setSymbol("♟︎"); // \u0265F
				break;
			case WHITE:
				setSymbol("♙"); // \u02659
				break;
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		switch(colour)
		{
			case BLACK:
				if ((i1 == i0 + 1) && (j1 == j0))
				{
					return true;
				}
				if ((i1 == i0 + 2) && (i0 == 2) && (j1 == j0))
				{
					return true;
				}
				// REQUIRES WORK
				if ((i1 == i0 + 1) && ((j1 == j0 + 1) || (j1 == j0 - 1)))
				{
					return true;
				}
				break;
			case WHITE:
				if ((i1 == i0 - 1) && (j1 == j0))
				{
					return true;
				}
				if ((i1 == i0 - 2) && (i0 == 5) && (j1 == j0))
				{
					return true;
				}
				// REQUIRES WORK
				if ((i1 == i0 - 1) && ((j1 == j0 + 1) || (j1 == j0 - 1)))
				{
					return true;
				}
				break;
			default:
				return false;
		}
		return false;
	}
}