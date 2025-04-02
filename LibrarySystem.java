interface Reservable{
	void reserveItem();
	boolean checkAvailability();
}
abstract class LibraryItem implements Reservable{
	int itemId;
	String title;
	String author;
	LibraryItem(int itemId, String title, String author){
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	public int getItemId(){
		return itemId;
	}
	public void setItemId(int itemId){
		this.itemId = itemId;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void getItemDetails(){
		System.out.println("Item Details: ");
		System.out.println("Item ID: "+itemId);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Loan Duration (in days): "+getLoanDuration());
	}
	public abstract int getLoanDuration();
}
class Book extends LibraryItem{
	boolean isAvailable;
	public Book(int itemId, String title, String author, boolean isAvailable){
		super(itemId, title, author);
		this.isAvailable = isAvailable;
	}
	@Override
	public int getLoanDuration(){
		return 14;
	}
	@Override
	public void reserveItem(){
		if(isAvailable){
			System.out.println("The book "+getTitle()+" is reserved.");
			isAvailable = false;
		}else{
			System.out.println("The book "+getTitle()+" is already reserved.");
		}
	}
	@Override
	public boolean checkAvailability(){
		System.out.println("The book "+getTitle()+" is available? "+isAvailable);
		return isAvailable;
			
	}
}
class Magazine extends LibraryItem{
	boolean isAvailable;
	public Magazine(int itemId, String title, String author, boolean isAvailable){
		super(itemId, title, author);
		this.isAvailable = isAvailable;
	}
	@Override
	public int getLoanDuration(){
		return 5;
	}
	@Override
	public void reserveItem(){
		if(isAvailable){
			System.out.println("The Magazine "+getTitle()+" is reserved.");
			isAvailable = false;
		}else{
			System.out.println("The Magazine "+getTitle()+" is already reserved.");
		}
	}
	@Override
	public boolean checkAvailability(){
		System.out.println("The Magazine "+getTitle()+" is available? "+isAvailable);
		return isAvailable;	
	}
}
class DVD extends LibraryItem{
	boolean isAvailable;
	public DVD(int itemId, String title, String author, boolean isAvailable){
		super(itemId, title, author);
		this.isAvailable = isAvailable;
	}
	@Override
	public int getLoanDuration(){
		return 10;
	}
	@Override
	public void reserveItem(){
		if(isAvailable){
			System.out.println("The DVD "+getTitle()+" is reserved.");
			isAvailable = false;
		}else{
			System.out.println("The DVD "+getTitle()+" is already reserved.");
		}
	}
	@Override
	public boolean checkAvailability(){
		System.out.println("The DVD "+getTitle()+" is available? "+isAvailable);
		return isAvailable;
		
	}
}
public class LibrarySystem{
	public static void main(String[] args){
		LibraryItem[] lib = new LibraryItem[3];
		lib[0] = new Book(123, "Harry Potter", "JK Rowling", true);
		lib[1] = new Magazine(12, "Week magazine", "John", false);
		lib[2] = new DVD(1, "Fast and furious", "Rone", true);
		for (LibraryItem item : lib) {
            item.getItemDetails();
            item.checkAvailability();
            item.reserveItem();
            item.checkAvailability();
			System.out.println();
		}
	}
}
