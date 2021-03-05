public class Test
{
	public static void main(String args[])
	{
		ExtendedPerson person = new ExtendedPerson("Joe", "Higgitt", "Male", 19);
		System.out.println(person.getName());
		System.out.println(person.getSurname());
		System.out.println(person.getGender());
		System.out.println(person.getAge());
	}
}