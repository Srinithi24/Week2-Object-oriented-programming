import java.util.List;
import java.util.ArrayList;
public class Library{
	static class Book{
		private String title;
		private String author;
		public Book(String title, String author){
			this.title = title;
			this.author = author;
		}
		public String getTitle(){
			return title;
		}
		public String getAuthor(){
			return author;
		}
	}
	static class Librarys{
		private String libraryName;
		private List<Book> booksList;
		
		public Librarys(String libraryName){
			this.libraryName = libraryName;
			this.booksList = new ArrayList<>();
		}
		public void addBook(Book b){
			booksList.add(b);
			System.out.println(b.getTitle() + " is written by "+b.getAuthor());
		}
		public void showBooks(){
			System.out.println("Library Name: "+libraryName);
			for(Book b: booksList){
				System.out.println(b.getTitle()+ " by author "+ b.getAuthor());
			}
		}
	}

	public static void main(String[] args){
		Book book1 = new Book("Mint","John"); 
		Book book2 = new Book("Rain","Jesica"); 
		Librarys centralLibrary = new Librarys("Central Library");
		centralLibrary.addBook(book1);
		centralLibrary.addBook(book2);
		centralLibrary.showBooks();
	}
}
