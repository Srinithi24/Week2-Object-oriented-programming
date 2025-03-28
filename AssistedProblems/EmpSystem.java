class Employee{
	String name;
	int id;
	double salary;
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayDetails(){
		System.out.println("Details: ");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}
class Manager extends Employee{
	int teamSize;
	Manager(String name, int id, double salary, int teamSize){
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	@Override
	void displayDetails(){
		System.out.println("Details: ");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
		System.out.println("Team Size: "+teamSize);
	}
}
class Developer extends Employee{
	String progLang;
	Developer(String name, int id, double salary, String progLang){
		super(name, id, salary);
		this.progLang = progLang;
	}
	@Override
	void displayDetails(){
		System.out.println("Details: ");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
		System.out.println("Programming Language: "+progLang);
	}
}
class Intern extends Employee{
	Intern(String name, int id, double salary){
		super(name, id, salary);
	}
	@Override
	void displayDetails(){
		System.out.println("Details: ");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}
public class EmpSystem{
	public static void main(String[] args){
		Employee manager = new Manager("Roshan", 32, 60000, 7);
		Employee developer = new Developer("Reena", 45, 30000, "Java");
		Employee intern = new Intern("Sonu", 6, 15000);
		manager.displayDetails();
		developer.displayDetails();
		intern.displayDetails();
	}
}