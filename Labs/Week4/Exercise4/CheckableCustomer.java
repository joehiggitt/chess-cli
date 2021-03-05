public class CheckableCustomer extends Customer implements Checkable
{
	public CheckableCustomer(String newId, String newName, double newLimit)
	{
		super(newId, newName, newLimit);
	}

	@Override
	public boolean check()
	{
		String id = getCustomerId();
		if (id.charAt(0) == 'i' && id.charAt(1) == 'd' && id.length() == 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}