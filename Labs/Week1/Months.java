import java.util.Random;

class Months
{
	public static void main(String[] args)
	{
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		Random rand = new Random();
		int i = rand.nextInt(11);
		String month = months[i];
		System.out.println(month);

		switch(month)
		{
			case "January":
				System.out.println("Winter");
				System.out.println("New Year, New Me!");
				break;
			case "February":
				System.out.println("Winter");
				break;
			case "March":
			case "April":
			case "May":
				System.out.println("Spring");
				break;
			case "June":
			case "July":
				System.out.println("Summer");
				break;
			case "August":
				System.out.println("Summer");
				System.out.println("Summer Holiday!");
				break;
			case "September":
			case "October":
			case "November":
				System.out.println("Autumn");
				break;
			case "December":
				System.out.println("Winter");
				break;
		}
	}
}