public class Library
{
	private Book[] bookList;
	private int currentNumUniqueBooks;

	public Library(int maxSize)
	{
		bookList = new Book[maxSize];
	}

	public void addBook(Book newBook)
	{
		bookList[currentNumUniqueBooks] = newBook;
		currentNumUniqueBooks++;
	}

	public void whichBooks()
	{
		for (int i = 0; i < bookList.length; i++)
		{
			if (bookList[i] != null)
			{
				System.out.println(bookList[i].getTitle());
			}
		}
	}

	public void whichAuthors()
	{
		for (int i = 0; i < bookList.length; i++)
		{
			if (bookList[i] != null)
			{
				System.out.println(bookList[i].getAuthor().getName());
			}
		}
	}

	public void borrowBook(Book book)
	{
		for (int i = 0; i < bookList.length; i++)
		{
			if (bookList[i] == book)
			{
				if (bookList[i].getItems() == 0)
				{
					System.out.println(bookList[i].getTitle() + " is not available.");
					return;
				}
				else
				{
					bookList[i].setItems(bookList[i].getItems() - 1);
					System.out.println(bookList[i].getTitle() + " has been booked for you.");
					return;
				}
			}
		}
		System.out.println(book.getTitle() + " is not available.");
	}

	public void returnBook(Book book)
	{
		for (int i = 0; i < bookList.length; i++)
		{
			if (bookList[i] == book)
			{
				bookList[i].setItems(bookList[i].getItems() + 1);
				System.out.println(bookList[i].getTitle() + " was successfully returned.");
				return;
			}
		}
		addBook(book);
	}

	public static void main(String[] args) {};
}