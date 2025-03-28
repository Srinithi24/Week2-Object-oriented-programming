class Device{
	int deviceId;
	String status;
	Device(int deviceId, String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	void displayStatus(){
		System.out.println("Device Id: "+deviceId);
		System.out.println("Status: "+status);
	}
}
class Thermostat extends Device{
	String temperatureSetting;
	Thermostat(int deviceId, String status, String temperatureSetting){
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	@Override
	void displayStatus(){
		super.displayStatus();
		System.out.println("Temperature Setting : "+temperatureSetting);
	}
}
public class SmartHomeDevices{
	public static void main(String[] args){
		Device t1 = new Thermostat(101, "Thermostat", "Celcius/Fahreinheit");
		System.out.println("Details: ");
		t1.displayStatus();
	}
}