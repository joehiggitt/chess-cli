public class B extends A
{
	public B()
	{
		super("Hello");
	}

	public static void main(String args[])
	{
		B b = new B();
		b.showName();
	}
}