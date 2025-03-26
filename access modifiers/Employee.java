public class Employee{
	public int employeeID;
	protected String department;
	private double salary;
	public Employee(int employeeID, String department, double salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public void displayDetails(){
		System.out.println("Employee ID: "+ employeeID);
		System.out.println("Department: "+ department);
		System.out.println("Salary: "+ salary);
	}
	public static void main(String[] args){
		Employee emp = new Employee(21, "SAP", 30000);
		emp.displayDetails();
		emp.setSalary(34500);
		emp.getSalary();
		emp.displayDetails();
		Manager mgr = new Manager(22, "HR", 50000);
		mgr.display();
	}
}
class Manager extends Employee{
	public Manager(int employeeID, String department, double salary){
		super(employeeID, department, salary);
	}
	public void display(){
		System.out.println("Employee ID: "+ employeeID);
		System.out.println("Department: "+ department);
		System.out.println("Salary: "+ getSalary());
	}
}