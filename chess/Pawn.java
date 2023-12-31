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
		boolean take = Board.hasPiece(i1, j1);

		// Checks if move involves taking own piece
		if (take && (Board.getPiece(i1, j1).getColour() == colour))
		{
			return false;
		}

		// Checks if movement is legit
		switch(colour)
		{
			case BLACK:
				if ((i1 == i0 + 1) && (j1 == j0) && !take)
				{
					return true;
				}
				if ((i1 == i0 + 2) && (i0 == 1) && (j1 == j0) && !take)
				{
					return true;
				}
				if ((i1 == i0 + 1) && ((j1 == j0 + 1) || (j1 == j0 - 1)) && take)
				{
					return true;
				}

			case WHITE:
				if ((i1 == i0 - 1) && (j1 == j0) && !take)
				{
					return true;
				}
				if ((i1 == i0 - 2) && (i0 == 6) && (j1 == j0) && !take)
				{
					return true;
				}
				if ((i1 == i0 - 1) && ((j1 == j0 + 1) || (j1 == j0 - 1)) && take)
				{
					return true;
				}
		}
		
		return false;
	}
}