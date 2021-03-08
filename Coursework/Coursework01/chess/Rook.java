package chess;

public class Rook extends Piece
{
	public Rook(PieceColour newColour)
	{
		super(newColour);
		switch(newColour)
		{
			case BLACK:
				setSymbol("♜"); // \u0265C
				break;
			case WHITE:
				setSymbol("♖"); // \u02656
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
		return false;
	}
}
