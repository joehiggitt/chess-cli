class MagicWordSquare
{
	public static void main(String[] args)
	{
		String[][] wordSquare = new String[4][4];
		String[][] wordSquare1 = {{"L", "I", "M", "B"}, {"A", "R", "E", "A"}, {"C", "O", "R", "K"}, {"K", "N", "E", "E"}};
		String[][] wordSquare2 = {{"T", "O", "O"}, {"U", "R", "N"}, {"B", "E", "E"}};
		String[][] wordSquare3 = {{"S", "C", "E", "N", "T"}, {"C", "A", "N", "O", "E"}, {"A", "R", "S", "O", "N"}, {"R", "O", "U", "S", "E"}, {"F", "L", "E", "E", "T"}};
		String[][] wordSquare4 = {{"B", "A", "R", "N"}, {"A", "R", "E", "A"}, {"L", "I", "A", "R"}, {"L", "A", "D", "Y"}};
		printDiagonal(wordSquare4, false);
	}

	public static void printRow(String[][] square, int i)
	{
		int len = square[i].length - 1;
		for (int j = 0; j <= len; j++)
		{
			System.out.println(square[i][j]);
		}
	}

	public static void printColumn(String[][] square, int j)
	{
		int len = square.length - 1;
		for (int i = 0; i <= len; i++)
		{
			System.out.println(square[i][j]);
		}
	}

	public static void printDiagonal(String[][] square, boolean bool)
	{
		int len = square.length - 1;
		if (bool)
		{
			for (int i = 0; i <= len; i++)
			{
				System.out.println(square[i][i]);
			}
		}
		else
		{
			for (int i = len; i >= 0; i--)
			{
				System.out.println(square[len - i][i]);
			}
		}
	}
}