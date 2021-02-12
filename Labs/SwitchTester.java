class SwitchTester
{
	public static void main(String args[])
	{
		int a = 8;
		int b = 8;
		switchExperiment(a, b);
	}
	public static void switchExperiment(int a, int b)
	{
		switch (a) {
			case 1:
				b -= 4;
			case 2:
				b += 4;
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
		System.out.println("b is " + b);
	}
}