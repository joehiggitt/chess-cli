import java.io.Console;

class HangmanDriver
{
	public static void main(String[] args)
	{
		Console keyboard = System.console();

		System.out.println("What's your name?");
		String name = keyboard.readLine("> ");
		System.out.println("Welcome " + name + "!");

		Hangman hangman = new Hangman(name);
		HangmanDictionary dictionary = new HangmanDictionary();
		HangmanVisuals visuals = new HangmanVisuals();

		hangman.setWord(dictionary.getWord());
		// System.out.println(hangman.getWord());
		System.out.println("Remaining guesses: " + hangman.getRemainingGuesses());
		System.out.println(hangman.getCurrentState());


		while (hangman.getRemainingGuesses() > 0)
		{
			System.out.println(hangman.getCurrentState());
			char[] previousGuesses = hangman.getGuesses();
			System.out.printf("You're previous guesses were ");
			for (int i = 0; i < previousGuesses.length; i++)
			{
				if (i == previousGuesses.length - 1)
				{
					System.out.printf(new String (previousGuesses[i]));
				}
				System.out.printf(new String (previousGuesses[i] + ", "));
			}
			System.out.println("\nMake a guess.");
			char guess = keyboard.readLine("> ").toLowerCase().charAt(0);
			hangman.makeGuess(guess);
		}
	}
}