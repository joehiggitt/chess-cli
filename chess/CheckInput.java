package chess;

public class CheckInput
{
	// CHECK BEHAVIOUR
	public boolean checkCoordinateValidity(String input)
	{
		if (input.equals("END"))
		{
			return true;
		}

		// Defines arrays of accepted input characters
		char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8'};
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

		// Checks if the input is in each array
		if (input.length() == 2)
		{
			for (char itemNums : nums)
			{
				if (input.indexOf(itemNums) == 0)
				{
					for (char itemLetters : letters)
					{
						if (input.indexOf(itemLetters) == 1)
						{
							return true;
						}
					}
					return false;
				}
			}
		}
		return false;
	}
}
