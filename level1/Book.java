import java.util.Scanner;
public class Book{
	String title;
	String author;
	double price;
	public Book(String title, String author ,double price) {
        this.title = title;
		this.author = author;
		this.price = price;
    }
	public void displayDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = scan.nextLine();
		System.out.print("Enter author: ");
		String author = scan.nextLine();
		System.out.print("Enter price: ");
		double price =  scan.nextDouble();
		Book b = new Book(title, author, price);
		b.displayDetails();
	scan.close();
	}

}