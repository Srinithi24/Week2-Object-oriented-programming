import java.util.*;
class Product{
	private String name;
	private double price;
	public Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
}
class Order{
	private static int idCounter = 1;
	private int orderId;
	private List<Product> products;
	public Order(){
		this.orderId = idCounter++;
		this.products = new ArrayList<>();
	}
	public void addProduct(Product product){
		products.add(product);
	}
	public double getTotalPrice(){
		double total = 0;
		for(Product p : products){
			total += p.getPrice();
		}
		return total;
	}
	public int getOrderId(){
		return orderId;
	}
	public List<Product> getProducts(){
		return products;
	}
}
class Customer{
	private String name;
	private List<Order> orders;
	public Customer(String name){
		this.name = name;
		this.orders = new ArrayList<>();
	}
	public void placeOrder(Order order){
		orders.add(order);
	}
	public String getName(){
		return name;
	}
	public List<Order> getOrder(){
		return orders;
	}
}
public class EcommercePlatform{
	public static void main(String[] args){
		Product p1 = new Product("Phone", 90000);
		Product p2 = new Product ("Earphones", 500);
		Order order1 = new Order();
		order1.addProduct(p1);
		order1.addProduct(p2);
		Customer cust1 = new Customer("Alan");
		cust1.placeOrder(order1);
		System.out.println("Customer 1: ");
		for (Order o: cust1.getOrder()){
			System.out.println("Order Id: "+o.getOrderId());
			for(Product p: o.getProducts()){
				System.out.println("Product name: "+p.getName()+" Price: "+p.getPrice());
			}
			System.out.println("Total price amount: "+o.getTotalPrice());
		}
	}
}
