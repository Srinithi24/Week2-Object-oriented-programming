import java.util.Scanner;
public class Student{
	String name;
	int rollNo;
	int marks;
	
	public Student(String name, int rollNo, int marks) {
        this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		
    }
	public char Grade(){
		if(marks>90){
			return 'A';
		}else if(75<marks && marks < 90){
			return 'B';
		}else if(55 <marks && marks < 75){
			return 'C';
		}else if(45<marks && marks < 55){
			return 'D';
		}else{
			return 'F';
		}
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + Grade());
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scan.nextLine(); 
		System.out.print("Enter Roll number: ");
		int rollNo = scan.nextInt(); 
		System.out.print("Enter marks: ");
		int marks =  scan.nextInt();
		
		Student s = new Student(name, rollNo, marks);
		s.displayDetails();
	scan.close();
	}

}