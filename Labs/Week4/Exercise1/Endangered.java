public class Endangered
{
	public static void main(String args[])
	{
		Endangered e = new Endangered();
		Oak o = new Oak();
		Baobab b = new Baobab();
		System.out.println(o.getName() + " is endangered: " + e.isEndangered(o));
		System.out.println(b.getName() + " is endangered: " + e.isEndangered(b));
	}

	private boolean isEndangered(Status s)
	{
		return s.endangered();
	}
}