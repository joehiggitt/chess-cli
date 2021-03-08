package chess;
import java.io.Console;

public class Game
{
	private static boolean gameEnd = false;

	// REQUIRES WORK
	public static void play()
	{
		Console keyboard = System.console();
		Board board = new Board();
		CheckInput checkInput = new CheckInput();
		String[] turn = {"White", "Black"};
		int count = 0;

		String origin = "";
		String destination = "";

		board.initialiseBoard();
		board.initialisePieces();

		while (!gameEnd)
		{
			// Output board
			board.printBoard();

			// Get and validate input
			int go = count % 2;
			System.out.println("\n--- " + turn[go] + "'s move ---");
			while (true)
			{
				System.out.println("Enter origin:");
				do
				{
					origin = keyboard.readLine("> ");
					if (!checkInput.checkCoordinateValidity(origin))
					{
						System.out.println("Invalid input.");
					}
				}
				while (!checkInput.checkCoordinateValidity(origin));
				if (origin.equals("END"))
				{
					gameEnd = true;
					break;
				}

				System.out.println("Enter destination:");
				do
				{
					destination = keyboard.readLine("> ");
					if (!checkInput.checkCoordinateValidity(destination))
					{
						System.out.println("Invalid input.");
					}
				}
				while (!checkInput.checkCoordinateValidity(destination));
				if (destination.equals("END"))
				{
					gameEnd = true;
					break;
				}

				// Convert input to usable type
				int i0 = Integer.parseInt(String.valueOf(origin.charAt(0))) - 1;
				int j0 = Integer.parseInt(String.valueOf(origin.charAt(1) - 97));
				int i1 = Integer.parseInt(String.valueOf(destination.charAt(0))) - 1;
				int j1 = Integer.parseInt(String.valueOf(destination.charAt(1) - 97));

				// CHECK MOVE IS VALID
				PieceColour colour = PieceColour.WHITE;
				Piece originPiece = board.getPiece(i0, j0);
				switch(go)
				{
					case 0:
						colour = PieceColour.WHITE;
						break;
					case 1:
						colour = PieceColour.BLACK;
						break;
				}
				
				if ((!board.hasPiece(i0, j0)) || (originPiece.getColour() != colour) || (!originPiece.isLegitMove(i0, j0, i1, j1)))
				{
					System.out.println("Move not valid.");
					continue;
				}

				// Move pieces and check for win
				boolean gameEnd = board.movePiece(i0, j0, i1, j1, board.getPiece(i1, j1));
				break;
			}

			count++;
		}		
	}
	
	// REQUIRES WORK
	public static void main (String args[])
	{
		play();
	}
}
