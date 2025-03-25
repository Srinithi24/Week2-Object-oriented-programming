import java.util.Scanner;
public class MobilePhone{
	String brand;
	String model;
	double price;
	
	public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
		this.model = model;
		this.price = price;
		
    }
	
	public void displayDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Brand: ");
		String brand = scan.nextLine(); 
		System.out.print("Enter Model: ");
		String model = scan.nextLine(); 
		System.out.print("Enter price: ");
		double price =  scan.nextDouble();
		
		MobilePhone m = new MobilePhone(brand, model, price);
		m.displayDetails();
	scan.close();
	}

}