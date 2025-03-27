class Book{
	static String libraryName = "Central Library";
	String title;
	String author;
	final int isbn;
	Book(String title, String author, int isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	static void displayLibraryName(){
		 System.out.println(libraryName);
	}
	void displayDetails(){
		if(this instanceof Book){
			System.out.println("Library name: "+libraryName);
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("ISBN: "+isbn);
		}
	}
	public static void main(String[] args){
		displayLibraryName();
		Book book1 = new Book("Harry potter", "JK Rowling", 1234);
		Book book2 = new Book("Let us C", "Yahwanth", 1235);
		book1.displayDetails();
		System.out.println();
		book2.displayDetails();
		System.out.println();
		
	}
}