package chess;

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
			default:
				System.out.println("Logic Error - King Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		return false;
	}
}
