class Vehicle{
	double maxSpeed;
	String fuelType;
	Vehicle(double maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	void displayInfo(){
		System.out.println("Max Speed: "+maxSpeed+ " km/hr");
		System.out.println("Fuel type: "+fuelType);
	}
}
class Car extends Vehicle{
	int seatCapacity;
	Car(double maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Seat capacity: "+seatCapacity);
	}
}
class Truck extends Vehicle{
	double loadCapacity;
	Truck(double maxSpeed, String fuelType, double loadCapacity){
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Load capacity: "+loadCapacity+" kg.");
	}
}
class Motorcycle extends Vehicle{
	boolean hasCarrier;
	Motorcycle(double maxSpeed, String fuelType, boolean hasCarrier){
		super(maxSpeed, fuelType);
		this.hasCarrier = hasCarrier;
	}
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Has Carrier: "+ (hasCarrier ? "Yes" : "No"));
	}
}
public class TransportSystem{
	public static void main(String[] args){
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car(90, "Diesel", 4);
		vehicles[1] = new Truck(190, "Petrol", 120);
		vehicles[2] = new Motorcycle(70, "Petrol", true);
		for(int i=0; i<3; i++){
			System.out.println("Vehicle "+(i+1));
			vehicles[i].displayInfo();
		}
	}
}