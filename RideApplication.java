interface GPS{
	String getCurrentLocation();
	void updateLocation(String location);
}
abstract class Vehicle implements GPS{
	private int vehicleId;
	private String driverName;
	private double ratePerKm;
	private String location;
	public Vehicle(int vehicleId, String driverName, double ratePerKm, String location){
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
		this.location = location;
	}
	public double getRatePerKm(){
		return ratePerKm;
	}
	public void setRatePerKm(double ratePerKm){
		this.ratePerKm = ratePerKm;
	}
	public void getVehicleDetails(){
		System.out.println("Vehicle Details: ");
		System.out.println("Vehicle ID: "+vehicleId);
		System.out.println("Driver name: "+driverName);
		System.out.println("Rate per km: "+ratePerKm);
		
	}
	public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
	public abstract double calculateFare(double distance);
}
class Car extends Vehicle{
	public Car(int vehicleId, String driverName, double ratePerKm, String location){
		super(vehicleId, driverName, ratePerKm, location);
		
	}
	public double calculateFare(double distance){
		return getRatePerKm() * distance;
	}
	
}
class Bike extends Vehicle{
	public Bike(int vehicleId, String driverName, double ratePerKm, String location){
		super(vehicleId, driverName, ratePerKm, location);
	}
	public double calculateFare(double distance){
		return getRatePerKm() * distance;
	}
}
class Auto extends Vehicle{
	public Auto(int vehicleId, String driverName, double ratePerKm, String location){
		super(vehicleId, driverName, ratePerKm, location);
	}
	public double calculateFare(double distance){
		return getRatePerKm() * distance;
	}
}
public class RideApplication{
	public static void main(String[] args){
		double distance = 10.0;
		Vehicle[] vehicle = new Vehicle[3];
		vehicle[0] = new Car(123, "Raaj", 100,"Chennai");
		vehicle[1] = new Bike(345, "Vishnu", 40, "Kolkata");
		vehicle[2] = new Auto(678, "Reena", 400, "Patna");
	for(Vehicle v: vehicle){
		v.getVehicleDetails();
		System.out.println("Current Location: " + v.getCurrentLocation());
        System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
        System.out.println();
		}
	}
}