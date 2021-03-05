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

		char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8'};
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		char num = input.charAt(0);
		char letter = Character.toLowerCase(input.charAt(1));

		if (input.length() == 2)
		{
			for (char itemNums : nums)
			{
				if (itemNums == num)
				{
					for (char itemLetters : letters)
					{
						if (itemLetters == num)
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
