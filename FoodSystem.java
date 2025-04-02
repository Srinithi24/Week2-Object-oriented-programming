interface Discountable{
	double applyDiscount();
	void getDiscountDetails();
}
abstract class FoodItem implements Discountable{
	String itemName;
	double price;
	int quantity;
	FoodItem(String itemName, double price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public void getItemDetails(){
		System.out.println("Food details: ");
		System.out.println("Item name: "+itemName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
		System.out.println("Total price: "+ calculateTotalPrice());
	}
	public abstract double calculateTotalPrice();
}
class VegItem extends FoodItem{
	double discount;
	VegItem(String itemName, double price, int quantity, double discount){
		super(itemName, price, quantity);
		this.discount = discount;
	}
	@Override
	public double applyDiscount(){
		return (getPrice() * getQuantity()) * (discount/100.0);
	}
	@Override
	public double calculateTotalPrice(){
		return (getPrice() * getQuantity()) - applyDiscount();
	}
	@Override
	public void getDiscountDetails(){
		System.out.println("The discount % is "+discount+" % and the price of "+getItemName()+" is "+ getPrice()+" and the quantity is "+ getQuantity() +" then the final amount is: "+calculateTotalPrice());
	}
}
class NonVegItem extends FoodItem{
	double discount;
	double charge = 100;
	NonVegItem(String itemName, double price, int quantity, double discount){
		super(itemName, price, quantity);
		this.discount = discount;
	}
	@Override
	public double applyDiscount(){
		return ((getPrice()+charge) * getQuantity()) * (discount/100.0);
	}
	@Override
	public double calculateTotalPrice(){
		return ((getPrice()+charge) * getQuantity()) - applyDiscount();
	}
	@Override
	public void getDiscountDetails(){
		System.out.println("The discount % is "+discount+" % and the price of "+getItemName()+" is "+ getPrice()+" and the quantity is "+ getQuantity() +" then the final amount is: "+calculateTotalPrice());
	}
}
public class FoodSystem{
	public static void main(String[] args){
		FoodItem[] food = new FoodItem[2];
		food[0] = new VegItem("Chapatti", 45, 3, 2);
		food[1] = new NonVegItem("Biriyani", 100, 2, 5);
		for(FoodItem f : food){
			f.getItemDetails();
			f.getDiscountDetails();
			System.out.println();
		}
	}
}