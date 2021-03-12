package chess;
import java.io.Console;

public class Game
{
	private static boolean gameEnd = false;

	public static void play()
	{
		// Initialise objects
		Console keyboard = System.console();
		Board board = new Board();
		CheckInput checkInput = new CheckInput();

		// Initialise local variables
		String[] turn = {"white", "black"};
		int count, go;
		count = go = 0;
		String origin = "";
		String destination = "";
		int i0, j0, i1, j1;
		i0 = i1 = j0 = j1 = 0;
		PieceColour colour = PieceColour.WHITE;

		gameEnd = false;

		board.initialiseBoard();
		board.initialisePieces();

		while (!gameEnd)
		{
			// Output board
			board.printBoard();

			// Sets variables before turn
			go = count % 2;
			switch(go)
			{
				case 0:
					colour = PieceColour.WHITE;
					break;
				case 1:
					colour = PieceColour.BLACK;
					break;
			}
			System.out.println("\n--- " + turn[go].substring(0, 1).toUpperCase() + turn[go].substring(1) + "'s move ---");

			// Get and validate input
			while (true)
			{
				// Asks for origin coordinates
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

				// Converts input to useable format
				i0 = Integer.parseInt(String.valueOf(origin.charAt(0))) - 1;
				j0 = Integer.parseInt(String.valueOf(origin.charAt(1) - 97));

				// Checks if piece selected at origin coordinates is valid
				if ((!board.hasPiece(i0, j0)) || (board.getPiece(i0, j0).getColour() != colour))
				{
					System.out.println("Square selected has no " + turn[go] + " piece.");
					continue;
				}

				// Asks for destination coordinates
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

				// Converts input to useable format
				i1 = Integer.parseInt(String.valueOf(destination.charAt(0))) - 1;
				j1 = Integer.parseInt(String.valueOf(destination.charAt(1) - 97));

				// Runs checks to ensure move is valid
				if ((i0 == i1) && (j0 == j1))
				{
					System.out.println("Can't move piece to same square.");
					continue;
				}

				if (!board.getPiece(i0, j0).isLegitMove(i0, j0, i1, j1))
				{
					System.out.println("Move not valid.");
					continue;
				}

				if (board.hasPiece(i1, j1))
				{
					if (board.getPiece(i1, j1).getColour() == colour)
					{
						System.out.println("Can't take a " + turn[go] + " piece.");
						continue;
					}
				}

				// Move pieces and check for win
				gameEnd = board.movePiece(i0, j0, i1, j1, board.getPiece(i0, j0));
				if (gameEnd)
				{
					System.out.println("\n" + turn[go].substring(0, 1).toUpperCase() + turn[go].substring(1) + " wins, congratulations!");
				}
				break;
			}
			count++;
		}		
	}

	public static void main (String args[])
	{
		String query = "";
		while (true)
		{
			play();
			System.out.println("\n\nWould you like to start a new chess game? (y/n)");
			do
			{
				Console keyboard = System.console();
				query = keyboard.readLine("> ");
				if (!query.equals("y") && !query.equals("n"))
				{
					System.out.println("Invalid input.");
				}
			}
			while (!query.equals("y") && !query.equals("n"));
			if (query.equals("n"))
			{
				break;
			}
		}
	}
}