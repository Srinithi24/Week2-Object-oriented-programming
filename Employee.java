import java.util.Scanner;
class Employee{
	static String companyName = "Capgemini";
	static int count = 0;
	String name;
	final int id;
	String designation;
	Employee(String name, int id, String designation){
		this.name = name;
		this.id = id;
		this.designation = designation;
		count++;
	}
	static int displayTotalEmployees(){
		return count;
	}
	void displayDetails(){
		if(this instanceof Employee){
			System.out.println("Company Name: "+ companyName);
			System.out.println("Name: "+ name);
			System.out.println("ID: "+ id);
			System.out.println("Designation: "+ designation);
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int num = scan.nextInt();
		Employee[] emp = new Employee[num];
		for(int i=0; i<num; i++){
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("ID: ");
			int id = scan.nextInt();
			scan.nextLine();
			System.out.print("Designation: ");
			String designation = scan.nextLine();
			emp[i] = new Employee(name, id, designation);
		}
		for(Employee e: emp){
			e.displayDetails();
		}
		System.out.println("Total employee count: "+ Employee.displayTotalEmployees());
		scan.close();
	}
}