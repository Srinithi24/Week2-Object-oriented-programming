import java.time.LocalDate;
class Order{
	int orderId;
	LocalDate orderDate;
	Order(int orderId, LocalDate orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	void getOrderStatus(){
		System.out.println("Order ID: "+ orderId);
		System.out.println("Order Date: "+ orderDate);
	}
}
class ShippedOrder extends Order{
	int trackingNumber;
	ShippedOrder(int orderId, LocalDate orderDate, int trackingNumber){
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	@Override
	void getOrderStatus(){
		super.getOrderStatus();
		System.out.println("Tracking number: "+trackingNumber);
	}
}
class DeliveredOrder extends ShippedOrder{
	LocalDate deliveryDate;
	DeliveredOrder(int orderId, LocalDate orderDate, int trackingNumber, LocalDate deliveryDate){
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	@Override
	void getOrderStatus(){
		super.getOrderStatus();
		System.out.println("Delivery Date: "+deliveryDate);
	}
}
public class OnlineOrderMgmt{
	public static void main(String[] args){
		Order ord = new DeliveredOrder(245, LocalDate.parse("2025-04-01"), 34567, LocalDate.parse("2025-04-10"));
		System.out.println("Order Status: ");
		ord.getOrderStatus();
	}
}