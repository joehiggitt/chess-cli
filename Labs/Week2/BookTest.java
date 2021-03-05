import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest
{
	@Test
	public void testBookTitle()
	{
		Author a = new Author("Oscar Wilde", 1889);
		Book b = new Book("The Importance of Being Earnest", a, 3);
		assertEquals(b.getTitle(),"The Importance of Being Earnest");
	}

	@Test
	public void testBookItems()
	{
		Author a = new Author("Oscar Wilde", 1889);
		Book b = new Book("The Importance of Being Earnest", a, 3);
		assertEquals(b.getItems(),3);
	}

	@Test
	public void testAuthor()
	{
		Author a = new Author("Oscar Wilde", 1889);
		assertEquals(a.getName(),"Oscar Wilde");
	}

	@Test
	public void testDateOfBirth()
	{
		Author a = new Author("Oscar Wilde", 1889);
		assertEquals(a.getYearOfBirth(),1889);
	}

	@Test
	public void testBookAuthor()
	{
		Author a = new Author("Oscar Wilde", 1889);
		Book b = new Book("The Importance of Being Earnest", a, 7);
		assertEquals(b.getAuthor().getName(),"Oscar Wilde");
	}
}