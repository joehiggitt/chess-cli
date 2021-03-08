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
			default:
				System.out.println("Logic Error - King Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		if ((i1 == i0) || (j1 == j0))
		{
			return true;
		}
		if (Math.abs(i1 - i0) == Math.abs(j1 - j0))
		{
			return true;
		}
		return false;
	}
}