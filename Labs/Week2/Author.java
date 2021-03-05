public class Author
{
	private String name;
	private int yearOfBirth;

	public Author(String newName, int newYearOfBirth)
	{
		name = newName;
		yearOfBirth = newYearOfBirth;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
		name = newName;
	}

	public int getYearOfBirth()
	{
		return yearOfBirth;
	}

	public void setYearOfBirth(int newYearOfBirth)
	{
		yearOfBirth = newYearOfBirth;
	}

	public static void main(String[] args) {};
}