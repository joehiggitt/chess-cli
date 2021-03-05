package chess;
import java.io.Console;

public class Game
{
	private static boolean gameEnd = false;
	private static int count = 0;

	// REQUIRES WORK
	public static void play()
	{
		Console keyboard = System.console();
		CheckInput checkInput = new CheckInput();
		String[] turn = {"White", "Black"};
		

		String origin = "";
		String destination = "";

		// Get and validate input
		System.out.println("\n--- " + turn[count % 2] + "'s move ---");
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

		// Convert input to usable type
		int i0 = Integer.parseInt(String.valueOf(origin.charAt(0))) - 1;
		int j0 = Integer.parseInt(String.valueOf(origin.charAt(1) - 97));
		int i1 = Integer.parseInt(String.valueOf(destination.charAt(0))) - 1;
		int j1 = Integer.parseInt(String.valueOf(destination.charAt(1) - 97));

		// MOVE PIECES

		
	}
	
	// REQUIRES WORK
	public static void main (String args[])
	{
		Board board = new Board();
		board.initialiseBoard();
		board.initialisePieces();
		board.printBoard();
		while (!gameEnd)
		{
			play();
			// Output board
			board.printBoard();
			// CHECK FOR WIN
			boolean win = false; // Replace win
			if (win)
			{
				gameEnd = true;
			}
			count++;
		}
	}
}
