import java.util.Scanner;
public class Vehicle{
	private String ownerName;
	private String vehicleType;
	private static double registrationFee = 1000;
	public Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	public void displayVehicleDetails(){
		System.out.println("Owner Name: "+ownerName + " Vehicle Type: "+vehicleType+ " Registration Fee: "+registrationFee);
	}
	public static void updateRegistrationFee(double regFee){
		registrationFee = regFee;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Vehicle c1 = new Vehicle("Roopa","Scooty");
		Vehicle c2 = new Vehicle("Roshan","RE");
		Vehicle c3 = new Vehicle("Paul", "Splender");
		System.out.println("Vehicle details");
		c1.displayVehicleDetails();
		Vehicle.updateRegistrationFee(5000);
		c2.displayVehicleDetails();
		Vehicle.updateRegistrationFee(8000);
		c3.displayVehicleDetails();
	}
}