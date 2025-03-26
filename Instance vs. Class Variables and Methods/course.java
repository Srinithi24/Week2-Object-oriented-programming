public class course{
	private String courseName;
	private int duration;
	private double fee;
	private static String instituteName = "SRM";
	public course(String courseName, int duration, double fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	public void displayCourseDetails(){
		System.out.println("Course Name: "+courseName + " Duration: "+duration+ " years Fee: "+fee+" rupees Institute Name: "+instituteName);
	}
	public static void updateInstituteName(String newName){
		instituteName = newName;
	}
	public static void main(String[] args){
		course c1 = new course("Data science", 3, 2000);
		course c2 = new course("Web development",4, 8000);
		course c3 = new course("Django", 2, 7000);
		System.out.println("course details");
		c1.displayCourseDetails();
		c2.displayCourseDetails();
		course.updateInstituteName("SRMIST");
		c3.displayCourseDetails();
	}
}