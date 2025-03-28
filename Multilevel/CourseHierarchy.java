class Course{
	String courseName;
	int duartion;
	Course(String courseName, int duartion){
		this.courseName = courseName;
		this.duartion = duartion;
	}
	void display(){
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duartion);
	}
}
class OnlineCourse extends Course{
	String platform;
	boolean isRecorded;
	OnlineCourse(String courseName, int duartion, String platform, boolean isRecorded){
		super(courseName, duartion);
		this.platform =platform;
		this.isRecorded = isRecorded;
	}
	@Override
	void display(){
		super.display();
		System.out.println("Platform: "+platform);
		System.out.println("Is Recorded? : "+(isRecorded ? "Yes" : "No"));
	}
}
class PaidOnlineCourse extends OnlineCourse{
	double fee;
	double discount;
	PaidOnlineCourse(String courseName, int duartion, String platform, boolean isRecorded, double fee, double discount){
		super(courseName, duartion, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	@Override
	void display(){
		super.display();
		System.out.println("Fee: "+fee);
		System.out.println("Discount: "+discount+" the fee to be paid: "+(fee*discount/100));
	}
}
public class CourseHierarchy{
	public static void main(String[] args){
		Course c1 = new PaidOnlineCourse("JAVA", 45, "Online", true, 7890, 25);
		System.out.println("Course details: ");
		c1.display();
	}
}