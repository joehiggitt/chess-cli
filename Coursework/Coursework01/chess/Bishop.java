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
		if (Math.abs(i1 - i0) == Math.abs(j1 - j0))
		{
			return true;
		}
		return false;
	}
}
