package labassessment2;

import labassessment2.Book;

public class BookStore extends Book 
{
	
	Book books[] = new Book("Java Programming", "Balaguruswamy", "12835", 30);

	public void sell(String bookTitle, int noOfCopies) 
        {
		boolean b = false;
		for (int i = 0; i < books.length; i++)
                {
			if ((books[i].getBookTitle() == bookTitle) && noOfCopies <= books[i].getNumOfCopies()) 
                        {
				b = true;
				int copies = books[i].getNumOfCopies() - noOfCopies;
				books[i].setNumOfCopies(copies);
			}
		}
		if (b == false)
			System.out.println("Book not found");
	}

	public void order(String isbn, int noOfCopies) 
        {
		boolean b = false;
		for (int i = 0; i < books.length; i++) 
                {
			if (books[i].getISBN() == isbn)
                        {
				b = true;
				int copies = books[i].getNumOfCopies() + noOfCopies;
				books[i].setNumOfCopies(copies);
                          }
		}
		if (b == false)
			System.out.println("Book not found");
	}


	public void display()
        {
		for (int i = 0; i < books.length; i++)
                {
                      books[i].display();
		}
	}

}
