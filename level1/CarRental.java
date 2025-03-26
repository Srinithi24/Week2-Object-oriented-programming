public class CarRental{
	private String customerName;
	private String carModel;
	private int rentalDays;
	private static final int price = 900;
	public CarRental(String customerName, String carModel, int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	public int Cost(){
		return price * rentalDays;
	}
	@Override
	public String toString(){
		return "Customer Name: "+customerName+" has rented "+carModel+" for "+rentalDays+" so the total cost would be "+Cost();
	}
	public static void main(String[] args){
		CarRental rent = new CarRental("Rahul", "BMW" , 3);
		System.out.println(rent);
	}
}