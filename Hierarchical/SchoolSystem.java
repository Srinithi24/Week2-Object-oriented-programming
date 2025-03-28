class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void displayRole(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Teacher extends Person{
	String subject;
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	@Override
	void displayRole(){
		super.displayRole();
		System.out.println("Subject: "+subject);
	}
}
class Student extends Person{
	char grade;
	Student(String name, int age, char grade){
		super(name, age);
		this.grade = grade;
	}
	@Override
	void displayRole(){
		super.displayRole();
		System.out.println("Grade: "+grade);
	}
}
class Staff extends Person{
	String role;
	Staff(String name, int age, String role){
		super(name, age);
		this.role = role;
	}
	@Override
	void displayRole(){
		super.displayRole();
		System.out.println("Role: "+role);
	}
}
public class SchoolSystem{
	public static void main(String[] args){
		Person p1 = new Teacher("Rani",35, "English");
		Person p2 = new Student("Sonu",8, 'A');
		Person p3 = new Staff("Yusuf",40, "Security");
		System.out.println("Teacher details");
		p1.displayRole();
		System.out.println("Student details");
		p2.displayRole();
		System.out.println("Staff details");
		p3.displayRole();
	}
}