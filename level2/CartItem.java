import java.util.Scanner;

public class CartItem {
    private String[] itemNames = new String[10];
    private double[] prices = new double[10];
    private int[] quantities = new int[10];
    private int itemCount = 0;

    public void addItem(String itemName, double price, int quantity) {
        for (int i = 0; i < itemCount; i++) {
            if (itemNames[i].equalsIgnoreCase(itemName)) {
                quantities[i] += quantity;
                System.out.println("Updated " + itemName);
                return;
            }
        }
        if (itemCount < 10) {
            itemNames[itemCount] = itemName;
            prices[itemCount] = price;
            quantities[itemCount++] = quantity;
            System.out.println(itemName + " added ");
        } else {
            System.out.println("Cart is full!");
        }
    }
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (itemNames[i].equalsIgnoreCase(itemName)) {
                System.out.println(itemName + " removed from the cart.");
                for (int j = i; j < itemCount - 1; j++) {
                    itemNames[j] = itemNames[j + 1];
                    prices[j] = prices[j + 1];
                    quantities[j] = quantities[j + 1];
                }
                itemCount--;
                return;
            }
        }
    }

    public void displayTotalCost() {
        double total = 0;
        System.out.println("Cart Items:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item Name: "+ itemNames[i]);
			System.out.println("Quantity: " + quantities[i]);
			System.out.println("Price: " + prices[i]);
            total += prices[i] * quantities[i];
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItem cart = new CartItem();

        while (true) {
            System.out.println("1. Add Item		2. Remove Item		3. Display Total Cost		4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                cart.addItem(name, price, quantity);
            } 
            else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                cart.removeItem(scanner.nextLine());
            } 
            else if (choice == 3) {
                cart.displayTotalCost();
            } 
            else if (choice == 4) {
                System.out.println("Thank you for shopping!");
                break;
            } 
            else {
                System.out.println("Invalid option! Try again.");
            }
        }
        scanner.close();
    }
}
