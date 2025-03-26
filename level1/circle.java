import java.util.Scanner;
public class circle{
	private double radius;
	public circle(){
		this.radius = 2.4;
	}
	public circle(double radius){
		this.radius = radius;
	}
	public double area(){
		return Math.PI * radius * radius;
	}
	@Override
	public String toString(){
		return "Area of circle: " + area();
	}
	public static void main(String[] args){
		circle circle1 = new circle();
		System.out.println("The default area: "+circle1);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double num = scan.nextDouble();
		circle circle2 = new circle(num);
		System.out.println("The user defined area: "+circle2);
	}
}