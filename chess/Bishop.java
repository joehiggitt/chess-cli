package chess;
import java.lang.Math;

public class Bishop extends Piece
{
	public Bishop(PieceColour newColour)
	{
		super(newColour);
		switch(newColour)
		{
			case BLACK:
				setSymbol("♝"); // \u0265D
				break;
			case WHITE:
				setSymbol("♗"); // \u02657
				break;
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		int iDif = i1 - i0;
		int jDif = j1 - j0;

		// Checks if move involves taking own piece
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == colour)
		{
			return false;
		}
		
		// Checks if movement is legit
		if (Math.abs(iDif) == Math.abs(jDif))
		{
			for (int x = 1; x < Math.abs(iDif); x++)
			{
				if ((iDif > 0) && (jDif > 0) && (Board.hasPiece(i0 + x, j0 + x)))
				{
					return false;
				}
				if ((iDif < 0) && (jDif < 0) && (Board.hasPiece(i0 - x, j0 - x)))
				{
					return false;
				}
				if ((iDif > 0) && (jDif < 0) && (Board.hasPiece(i0 + x, j0 - x)))
				{
					return false;
				}
				if ((iDif < 0) && (jDif > 0) && (Board.hasPiece(i0 - x, j0 + x)))
				{
					return false;
				}
			}
			return true;
		}

		return false;
	}
}