class Person
{
	protected String name;
	protected String surname;
	protected String gender;

	// public String name;
	// public String surname;
	// public String gender;

	// public Person() {}

	public Person(String newName, String newSurame, String newGender)
	{
		name = newName;
		surname = newSurame;
		gender = newGender;
	}

	public String getName()
	{
		return name;
	}

	public String getSurname()
	{
		return surname;
	}

	public String getGender()
	{
		return gender;
	}
}