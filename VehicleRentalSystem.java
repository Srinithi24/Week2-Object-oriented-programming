import java.util.*;
interface Insurable{
	double calculateInsurance();
	String getInsuranceDetails();
}
abstract class Vehicle implements Insurable{
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	private String insurancePolicyNumber;
	private int days;
	public Vehicle(String vehicleNumber, String type, double rentalRate, int days, String insurancePolicyNumber){
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.days = days;
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	public String getVehicleNum(){
		return vehicleNumber;
	}
	public void setVehicleNum(){
		this.vehicleNumber = vehicleNumber;
	}
	public String getType(){
		return type;
	}
	public void setType(){
		this.type = type;
	}
	public double getRentalRate(){
		return rentalRate;
	}
	public void setRentalRate(){
		this.rentalRate = rentalRate;
	}
	public int getDays(){
		return days;
	}
	public void setDays(){
		this.days = days;
	}
	public String getInsurancePolicyNumber(){
		return insurancePolicyNumber;
	}
	public void setInsurancePolicyNumber(){
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	public abstract double calculateRentalCost(int days);
	public void display(){
		System.out.println("Vehicle number: "+vehicleNumber);
		System.out.println("Vehicle Type: "+type);
		System.out.println("Rental rate: "+rentalRate);
		System.out.println("Days: "+days);
		System.out.println("Rental Cost: " + calculateRentalCost(days));
		System.out.println("Insurance Cost: ₹" + calculateInsurance());
        System.out.println(getInsuranceDetails());
	}
}
class Car extends Vehicle{
	public Car(String vehicleNumber, String type, double rentalRate, int days, String insurancePolicyNumber){
		super(vehicleNumber, type, rentalRate, days, insurancePolicyNumber);
		
	}
	@Override
	public double calculateRentalCost(int days){
		return days*getRentalRate();
	}
	@Override
	public double calculateInsurance(){
		return 0.05 * getRentalRate();
	}
	@Override
	public String getInsuranceDetails(){
		return "Car Insurance Policy number: "+ getInsurancePolicyNumber();
	}
}
class Bike extends Vehicle{
	public Bike(String vehicleNumber, String type, double rentalRate, int days, String insurancePolicyNumber){
		super(vehicleNumber, type, rentalRate, days, insurancePolicyNumber);
		
	}
	@Override
	public double calculateRentalCost(int days){
		return days*getRentalRate();
	}
	@Override
	public double calculateInsurance(){
		return 0.1 * getRentalRate();
	}
	@Override
	public String getInsuranceDetails(){
		return "Bike Insurance Policy number: "+ getInsurancePolicyNumber();
	}
}
class Truck  extends Vehicle{
	public Truck (String vehicleNumber, String type, double rentalRate, int days, String insurancePolicyNumber){
		super(vehicleNumber, type, rentalRate, days, insurancePolicyNumber);
		
	}
	@Override
	public double calculateRentalCost(int days){
		return days*getRentalRate();
	}
	@Override
	public double calculateInsurance(){
		return 0.5 * getRentalRate();
	}
	@Override
	public String getInsuranceDetails(){
		return "Truck  Insurance Policy number: "+ getInsurancePolicyNumber();
	}
}
public class VehicleRentalSystem{
	public static void main(String[] args){
		List<Vehicle> vehicles = Arrays.asList(
			new Car("TN97BK2458", "Maruti Suzuki", 3000, 4, "CAR98765"),
			new Bike("TN02BK1226", "Scooty", 7000, 8, "BIKE7890"),
			new Truck("TN07BU9033", "Maruti Suzuki", 8000, 9, "TRUCK9877")
		);
		for (Vehicle v : vehicles) {
			v.display();
			System.out.println();
        }
	}
}
