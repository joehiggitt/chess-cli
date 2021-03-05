class SwitchTester
{
	public static void main(String args[])
	{
		// short a = 1;
		int b = 1;
		for (int a = 1; a < 6; a++)
		{
			System.out.println("a is " + a);
			switchExperiment(a, a * a);
		}
	}
	
	public static void switchExperiment(int a, int b)
	{
		switch (a) {
			case 1:
				b -= 4;
				break;
			case 2:
				b += 4;
				break;
			case 3:
				b /= 4;
				break;
			case 4:
				b *= 4;
				break;
			default:
				b = 0;
				break;
		}
		System.out.println("b is " + b + "\n");
	}
}