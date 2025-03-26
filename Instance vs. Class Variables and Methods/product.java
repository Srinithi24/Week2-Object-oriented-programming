public class product{
	private String productName;
	private double price;
	private static int totalProducts = 0;
	public product(String productName, double price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	public void  displayProductDetails(){
		System.out.println("Product Name: "+productName + " price: "+price);
	}
	public static void displayTotalProducts(){
		System.out.println("Total Products: "+totalProducts);
	}
	public static void main(String[] args){
		product p1 = new product("Laptop", 2000);
		product p2 = new product("Computer", 8000);
		product p3 = new product("TV", 7000);
		System.out.println("Product details");
		p1.displayProductDetails();
		p2.displayProductDetails();
		p3.displayProductDetails();
		System.out.println("Total Products");
		product.displayTotalProducts();
	}
}