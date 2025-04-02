interface Taxable{
	void calculateTax();
	double getTaxDetails();
}
abstract class Product implements Taxable{
	private int productId;
	private String name;
	private double price;
	protected double tax;
	public Product(int productId, String name, double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	public int getProductId(){
		return productId;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public abstract double calculateDiscount();
	public void displayDetails(){
		System.out.println("Product ID: "+productId);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Discount: "+calculateDiscount());
		System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + getTaxDetails());
	}
	
}
class Electronics extends Product{
	private double discount;
	public Electronics(int productId, String name, double price, double discount){
		super(productId, name, price);
		this.discount = discount;
	}
	@Override
	public double calculateDiscount(){
		return getPrice() * (discount/100);
	}
	@Override
	public void calculateTax(){
		tax = getPrice() * 0.18;
	}
	@Override
	public double getTaxDetails(){
		return getPrice() + tax - calculateDiscount();
	}
}
class Clothing extends Product{
	private double discount;
	public Clothing(int productId, String name, double price, double discount){
		super(productId, name, price);
		this.discount = discount;
	}
	@Override
	public double calculateDiscount(){
		return getPrice() * (discount/100);
	}
	@Override
	public void calculateTax(){
		tax = getPrice() * 0.20;
	}
	@Override
	public double getTaxDetails(){
		return getPrice() + tax - calculateDiscount();
	}
}
class Groceries extends Product{
	double discount;
	public Groceries(int productId, String name, double price, double discount){
		super(productId, name, price);
		this.discount = discount;
	}
	@Override
	public double calculateDiscount(){
		return getPrice() * (discount/100.0);
	}
	@Override
	public void calculateTax(){
		tax = getPrice() * 0.05;
	}
	@Override
	public double getTaxDetails(){
		return getPrice() + tax - calculateDiscount();
	}
}
public class EcommerceSystem{
	public static void main(String[] args){
		Product prod1 = new Electronics(23, "Mobile", 45000, 10);
		Product prod2 = new Clothing(28, "Shirt", 450, 10);
		Product prod3 = new Groceries(29, "Apple", 100, 2);
		Product[] products = { prod1, prod2, prod3 };
		for(Product p : products){
			p.calculateTax();
			p.displayDetails();
			System.out.println();
		}
	}
}