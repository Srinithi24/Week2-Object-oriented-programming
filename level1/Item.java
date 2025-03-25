import java.util.Scanner;
public class Item{
	int itemCode;
	String itemName;
	double price;
	int quantity;
	public Item(int itemCode, String itemName ,double price, int quantity) {
        this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
    }
	public double cost(){
		return quantity * price;
	}
	public void displayDetails() {
		System.out.println("Item Code: "+itemCode);
		System.out.println("Item Name: " + itemName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Cost: " + cost());
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Item Code: ");
		int itemCode = scan.nextInt();
		scan.nextLine(); 
		System.out.print("Enter Item Name: ");
		String itemName = scan.nextLine();
		System.out.print("Enter price: ");
		double price =  scan.nextDouble();
		System.out.print("Enter quantity: ");
		int quantity = scan.nextInt();
		Item i = new Item(itemCode, itemName, price, quantity);
		i.displayDetails();
	scan.close();
	}

}