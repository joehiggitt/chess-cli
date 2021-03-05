package chess;
import java.io.Console;

public class Game
{
	private static boolean gameEnd = false;

	// REQUIRES WORK
	public static void play()
	{
		Console keyboard = System.console();
		CheckInput checkInput = new CheckInput();
		String[] turn = {"White", "Black"};

		while (!gameEnd)
		{
			// Get and validate input
			System.out.println("--- " + turn[i] + "'s move ---");
			System.out.println("Enter origin:");
			String origin;
			while (!checkInput.checkCoordinateValidity(origin))
			{
				origin = keyboard.readLine("> ");
				if (!checkInput.checkCoordinateValidity(origin))
				{
					System.out.println("Invalid input.");
				}
			}
			System.out.println("Enter destination:");
			String destination;
			while (!checkInput.checkCoordinateValidity(origin))
			{
				destination = keyboard.readLine("> ");
				if (!checkInput.checkCoordinateValidity(origin))
				{
					System.out.println("Invalid input.");
				}
			}

			// Convert input to usable type
			int i0 = Integer.parseInt(String.valueOf(origin.charAt(0))) - 1;
			int j0 = Integer.parseInt(String.valueOf(origin.charAt(1) - 49));
			int i1 = Integer.parseInt(String.valueOf(destination.charAt(0))) - 1;
			int j1 = Integer.parseInt(String.valueOf(destination.charAt(1) - 49));

			// MOVE PIECES

			// Output board
			Board.printBoard();

			// CHECK FOR WIN
			boolean win = false; // Replace win
			if (win)
			{
				gameEnd = true;
			}
		}		
	}
	
	// REQUIRES WORK
	public static void main (String args[])
	{
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		//Game.play();
	}
}
