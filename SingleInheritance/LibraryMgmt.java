class Book{
	String title;
	int publicationYear;
	Book(String title, int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	void displayInfo(){
		System.out.println("Title: "+title);
		System.out.println("Publication Year: "+publicationYear);
	}
}
class Author extends Book{
	String name;
	String bio;
	Author(String title, int publicationYear, String name, String bio){
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Name: "+name);
		System.out.println("Bio: "+bio);
	}
}
public class LibraryMgmt{
	public static void main(String[] args){
		Book b1 = new Book("Harry Potter", 2010);
		Book a1 = new Author("Harry Potter", 2010, "JK Rowling", "JK Rowling is the author of the Harry Potter series");
		System.out.println("Book details: ");
		b1.displayInfo();
		System.out.println("Book details and author details: ");
		a1.displayInfo();
	}
}