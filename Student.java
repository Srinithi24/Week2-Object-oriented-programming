import java.util.Scanner;
class Student{
	static String universityName = "SRM";
	static int count = 0;
	String name;
	final int rollNumber;
	char grade;
	Student(String name, int rollNumber, char grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		count++;
	}
	static int displayTotalStudents(){
		return count;
	}
	void displayDetails(){
		if(this instanceof Student){
			System.out.println("Student Name: "+name);
			System.out.println("Student Roll Number: "+rollNumber);
			System.out.println("Student Grade: "+grade);
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int num = scan.nextInt();
		Student[] std = new Student[num];
		for(int i=0; i<num; i++){
			System.out.print("Enter the name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Enter the rollNumber: ");
			int rollNumber = scan.nextInt();
			System.out.print("Enter the Grade: ");
			char grade = scan.next().charAt(0);
			std[i] = new Student(name, rollNumber, grade);
		}
		for(Student s: std){
			s.displayDetails();
		}
		System.out.println("Total number of students: "+Student.displayTotalStudents());
		scan.close();
	}
}