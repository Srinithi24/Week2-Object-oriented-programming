public class HotelBooking{
	private String guestName;
	private String roomType;
	private int nights;
	public HotelBooking(){
		this.guestName = "Raj";
		this.roomType = "suite";
		this.nights = 1;
	}
	public HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	public HotelBooking(HotelBooking copy){
		this(copy.guestName, copy.roomType, copy.nights);
	}
	@Override
	public String toString(){
		return "Guest name: "+guestName+" Room Type: "+roomType+ " Nights: "+nights;
	}
	public static void main(String[] args){
		HotelBooking booking1 = new HotelBooking();
		System.out.println("Default: "+booking1);
		HotelBooking booking2 = new HotelBooking("revanth", "suite", 2);
		System.out.println("parmetrized: "+booking2);
		HotelBooking booking3 = new HotelBooking(booking2);
		System.out.println("Copy: "+booking3);
	}
}