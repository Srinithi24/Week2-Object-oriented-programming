import java.util.Scanner;
class Product {
    static double discount = 5; 
    final int productID; 
    String productName;
    double price;
    int quantity;
    static int idCounter = 1; 
    Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.productID = idCounter++; 
    }
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof Product) { 
            System.out.println("\nProduct ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Original Price: " + (price * quantity));
            double discountedPrice = (price * quantity) - ((price * quantity) * discount / 100);
            System.out.println("Price after " + discount + "% discount: " + discountedPrice);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product pro1 = new Product("Waffle", 2, 250);
        Product pro2 = new Product("Brownie", 3, 130);
        Product pro3 = new Product("Pizza", 2, 50);
        pro1.displayDetails();
        pro2.displayDetails();
        pro3.displayDetails();
        System.out.println("\nUpdating discount to 10%.");
        Product.updateDiscount(10);
        pro1.displayDetails();
        pro2.displayDetails();
        pro3.displayDetails();
        scan.close();
    }
}
