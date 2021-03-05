class ExtendedPerson extends Person
{
	private int age;

	public ExtendedPerson(String newName, String newSurame, String newGender, int newAge)
	{
		// super(newName, newSurame, newGender);
		name = newName;
		surname = newSurame;
		gender = newGender;
		age = newAge;
	}

	public int getAge()
	{
		return age;
	}
}