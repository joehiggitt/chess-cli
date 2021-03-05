public class Book
{
	private String title;
	private Author author;
	private int items;

	public Book(String newTitle, Author newAuthor, int newItems)
	{
		title = newTitle;
		author = newAuthor;
		items = newItems;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String newTitle)
	{
		title = newTitle;
	}

	public Author getAuthor()
	{
		return author;
	}

	public void setAuthor(Author newAuthor)
	{
		author = newAuthor;
	}

	public int getItems()
	{
		return items;
	}

	public void setItems(int newItems)
	{
		items = newItems;
	}
	
	public static void main(String[] args) {};
}