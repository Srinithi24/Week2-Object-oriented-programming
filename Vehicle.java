class Vehicle {
    static double registrationFee = 500;
    String ownerName;
    String vehicleType;
    final int registrationNumber;
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    static void updateRegistrationFee(double newRegFee) {
        registrationFee = newRegFee;
    }
    void displayDetails() {
        if (this instanceof Vehicle) { 
            System.out.println("\nOwner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", 101);
        Vehicle v2 = new Vehicle("Bob", "Bike", 102);
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(600);
        System.out.println("\nAfter updating registration fee:");
        v1.displayDetails();
        v2.displayDetails();
    }
}
