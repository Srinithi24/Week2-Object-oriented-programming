interface Refuelable{
	void refuel();
}
class Vehicle{
	int maxSpeed;
	String model;
	Vehicle(int maxSpeed, String model){
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	void display(){
		System.out.println("Max Speed is "+maxSpeed+" km/hr for model "+model);
	}
}
class ElectricVehicle extends Vehicle{
	boolean isCharageable;
	ElectricVehicle(int maxSpeed, String model, boolean isCharageable){
		super(maxSpeed, model);
		this.isCharageable = isCharageable;
	}
	void charge(){
		System.out.println("For model "+model+" it "+ (isCharageable ? "Can":"Cannot")+" be chargeable.");
	}
}
class PetrolVehicle extends Vehicle implements Refuelable{
	boolean isRefuelable;
	PetrolVehicle (int maxSpeed, String model, boolean isRefuelable){
		super(maxSpeed, model);
		this.isRefuelable = isRefuelable;
	}
	public void refuel(){
		System.out.println("For model "+model+" it "+ (isRefuelable ? "Can":"Cannot")+" be refuelable.");
	}
}
public class VehicleSystem{
	public static void main(String[] args){
		ElectricVehicle ev = new ElectricVehicle(120, "Tata Nexon EV", true);
		PetrolVehicle pv = new PetrolVehicle(150, "Maruti Suzuki", true);
		ev.display();
		ev.charge();
		System.out.println();
		pv.display();
		pv.refuel();
	}
}