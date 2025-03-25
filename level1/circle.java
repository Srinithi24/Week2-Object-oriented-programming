import java.util.Scanner;
public class circle{
	double radius;
	public circle(double radius) {
        this.radius = radius;
    }
	public double area(){
		return Math.PI * radius *radius;
	}
	public double circumference(){
		return 2 * Math.PI * radius;
	}
	public void displayDetails() {
		System.out.println("Radius: "+radius);
		System.out.println("Area: " + area());
		System.out.println("Circumference: " + circumference());
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius =  scan.nextDouble();
		circle c = new circle(radius);
		c.displayDetails();
	scan.close();
	}

}