package chess;
import java.lang.Math;

public class Queen extends Piece
{
	public Queen(PieceColour newColour)
	{
		super(newColour);
		switch(newColour)
		{
			case BLACK:
				setSymbol("♛"); // \u0265B
				break;
			case WHITE:
				setSymbol("♕"); // \u02655
				break;
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		int iDif = i1 - i0;
		int jDif = j1 - j0;

		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == colour)
		{
			return false;
		}

		if (i1 == i0)
		{
			for (int j = 1; j < Math.abs(jDif); j++)
			{
				if ((jDif > 0) && (Board.hasPiece(i0, j0 + j)))
				{
					return false;
				}
				if ((jDif < 0) && (Board.hasPiece(i0, j0 - j)))
				{
					return false;
				}
			}
			return true;
		}

		if (j1 == j0)
		{
			for (int i = 1; i < Math.abs(iDif); i++)
			{
				if ((iDif > 0) && (Board.hasPiece(i0 + i, j0)))
				{
					return false;
				}
				if ((iDif < 0) && (Board.hasPiece(i0 - i, j0)))
				{
					return false;
				}
			}
			return true;
		}

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