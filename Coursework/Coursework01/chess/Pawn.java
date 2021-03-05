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