import java.util.Scanner;
public class employee{
	String name;
	int id;
	int salary;
	public employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary Items: "+salary);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.print("Enter your id: ");
		int id = scan.nextInt();
		System.out.print("Enter your salary: ");
		int salary = scan.nextInt();
		employee emp = new employee(name, id, salary);
		emp.displayDetails();
	}

}