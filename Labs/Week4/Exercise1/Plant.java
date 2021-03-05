public abstract class Plant implements Status
{
	private String name;

	public Plant(String newName)
	{
		setName(newName);
	}

	public void setName(String newName)
	{
		name = newName;
	}

	public String getName()
	{
		return name;
	}
}