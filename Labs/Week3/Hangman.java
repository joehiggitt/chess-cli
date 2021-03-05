import java.io.Console;

class Hangman
{
	public final int MAXGUESSES;

	private String playerName;
	private String word;
	private char[] guesses;

	Hangman(String newPlayerName)
	{
		playerName = newPlayerName;
		MAXGUESSES = 20;
		guesses = new char[MAXGUESSES];
	}

	public String getPlayerName()
	{
		return playerName;
	}

	public void setPlayerName(String newPlayerName)
	{
		playerName = newPlayerName;
	}

	public String getWord()
	{
		return word;
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public String getCurrentState()
	{
		String currentState = "";
		for (int i = 0; i < word.length(); i++)
		{
			int check = 0;
			for (int j = 0; j < MAXGUESSES - getRemainingGuesses(); j++)
			{
				if (word.charAt(i) == guesses[j])
				{
					currentState += word.charAt(i) + " ";
					break;
				}
				else
				{
					check++;
				}
			}
			if (check == MAXGUESSES - getRemainingGuesses())
			{
				currentState += "_ ";
			}
		}
		return currentState;
	}

	public char[] getGuesses()
	{
		return guesses;
	}

	public int getRemainingGuesses()
	{
		int count = 0;
		for (char item : guesses)
		{
			if (item != 0)
			{
				count++;
			}
		}
		return MAXGUESSES - count;
	}

	public boolean makeGuess(char guess)
	{
		for (char item : guesses)
		{
			if (item == guess)
			{
				return true;
			}
		}
		// int index = 0;
		// System.out.println("guesses.length = " + guesses.length);
		// for (int i = 0; i < guesses.length - 1; i++)
		// {
		// 	System.out.println("i = " + i);
		// 	System.out.println("guesses[" + i + "] = " + guesses[i]);
		// 	if (guesses[i] < guess)
		// 	{
		// 		// if (i + 1 == guesses.length)
		// 		// {
		// 		// 	// GAME ENDS
		// 		// }
		// 		if (guesses[i + 1] > guess)
		// 		{
		// 			index = i + 1;
		// 			break;
		// 		}
		// 	}
		// }
		// char[] temp = new char[MAXGUESSES];
		// for (int i = 0; i < guesses.length; i++)
		// {
		// 	if (i < index)
		// 	{
		// 		temp[i] = guesses[i];
		// 	}
		// 	else if (i == index)
		// 	{
		// 		temp[i] = guess;
		// 	}
		// 	else if (i > index && guesses[i] != 0)
		// 	{
		// 		temp[i] = guesses[i - 1];
		// 	}
		// }
		// guesses = temp;
		for (int i = 0; i < guesses.length - 1; i++)
		{
			if (guesses[i] == 0)
			{
				guesses[i] = guess;
				break;
			}
		}
		return false;
	}
}

		