public class LibraryBookingSystem {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public LibraryBookingSystem() {
        this.title = "HARRY POTTER";
        this.author = "JK ROWLING";
        this.price = 2000;
        this.availability = true;
    }

    public LibraryBookingSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public boolean borrow() {
        if (availability) {
            availability = false;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return availability;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + 
               "  Price: " + price + 
               " | Available: " + (availability ? "Yes" : "No");
    }

    public static void main(String[] args) {
        LibraryBookingSystem book1 = new LibraryBookingSystem();
        System.out.println(book1);
        if (book1.borrow()) {
            System.out.println("Borrowed");
        } else {
            System.out.println("Unable to Borrow");
        }
        
        System.out.println(book1);
    }
}