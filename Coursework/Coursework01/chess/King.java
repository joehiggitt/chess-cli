package chess;
import java.lang.Math;

public class King extends Piece
{
	public King(PieceColour newColour)
	{
		super(newColour);
		switch(newColour)
		{
			case BLACK:
				setSymbol("♚"); // \u0265A
				break;
			case WHITE:
				setSymbol("♔"); // \u02654
				break;
			default:
				System.out.println("Logic Error - King Class - newColour");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		// Checks if move involves taking own piece
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == colour)
		{
			return false;
		}
		
		// Checks if movement is legit
		if ((Math.abs(i1 - i0) == 1) || (Math.abs(j1 - j0) == 1))
		{
			return true;
		}
		
		return false;
	}
}
