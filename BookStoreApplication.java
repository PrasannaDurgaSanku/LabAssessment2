package labassessment2;

import java.util.Scanner;

public class BookStoreApplication 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BookStore b = new BookStore();
		System.out.println("Enter 1 to display books");
		System.out.println("Enter 2 to order books");
		System.out.println("Enter 3 to sell books");

		while (true) {
			System.out.print("Enter your choice: ");
			int choice= sc.nextInt();
			switch (choice) {
			case 1:
				b.display();
				break;
			case 2:
				b.sell("Java Programming", 2);
				break;
			case 3:
				b.order("12835", 1);
				break;
			default:
				return;
			}
		}
	}
}