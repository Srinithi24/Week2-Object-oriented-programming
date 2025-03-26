public class books {
	private String title;
	private String author;
	private double price;
	
	public books(){
		this.title = "Harry Potter";
		this.author = "JK Rowling";
		this.price = 1000;
	}
	public books(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
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
	public double price(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	@Override
	public String toString(){
		return "Book -> title : "+title+" price: "+price+" author: "+author;
	}
	public static void main(String[] args){
		books book1 = new books();
		System.out.println(book1);
		books book2 = new books("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
		System.out.println(book2);		
	}
}