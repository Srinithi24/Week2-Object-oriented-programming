interface Department {
	void assignDepartment(String departmentName);
	String getDepartmentDetails();
}
abstract class Employee implements Department{
	private int employeeId;
	private String name;
	private double baseSalary;
	private String department;
	
	public Employee(int employeeId, String name, double baseSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public int getEmployeeId(){
		return employeeId;
	}
	public String getName(){
		return name;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary){
		this.baseSalary = baseSalary;
	}
	public abstract double calculateSalary();
	public void displayDetails(){
		System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: " + calculateSalary());
	}
	@Override
	public void assignDepartment(String departmentName){
		this.department = departmentName;
	}
	@Override 
	public String getDepartmentDetails(){
		return department;
	}
}
class FullTimeEmployee extends Employee{
	private double bonus;
	public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus){
		super(employeeId, name, baseSalary);
		this.bonus = bonus;
	}
	public double calculateSalary(){
		return getBaseSalary()+bonus;
	}
}
class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate){
		super(employeeId, name, baseSalary);
		this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
	}
	public double calculateSalary(){
		return getBaseSalary() + (hoursWorked * hourlyRate);
	}
}
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        emp1.assignDepartment("Engineering");

        Employee emp2 = new PartTimeEmployee(102, "Bob", 20000, 20, 1000);
        emp2.assignDepartment("Support");

        Employee[] employees = { emp1, emp2 };

        for (Employee emp : employees) {
            System.out.println();
            emp.displayDetails();
        }
    }
}