import java.util.Scanner;
class Patient {
    static String hospitalName = "Ramachandra Hospital"; 
    static int count = 0; 
    String name;
    int age;
    String ailment;
    final int patientID;
    Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = ++count;
    }
    static int getTotalPatients() {
        return count;
    }
    void displayDetails() {
        if (this instanceof Patient) { 
            System.out.println("\nPatient ID: " + patientID);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital Name: " + hospitalName);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of patients: ");
        int n = scan.nextInt();
        scan.nextLine();
        Patient[] patients = new Patient[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Patient Name: ");
            String name = scan.nextLine();
            System.out.print("Enter Patient Age: ");
            int age = scan.nextInt();
            scan.nextLine(); 
            System.out.print("Enter Ailment: ");
            String ailment = scan.nextLine();
            patients[i] = new Patient(name, age, ailment);
        }
        for (Patient p : patients) {
            p.displayDetails();
        }
        System.out.println("\nTotal Number of Patients: " + Patient.getTotalPatients());

        scan.close();
    }
}
