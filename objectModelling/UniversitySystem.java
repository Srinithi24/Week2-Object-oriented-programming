import java.util.ArrayList;
class Faculty{
	private String name;
	public Faculty(String name){
		this.name = name;
	}
	public void displayFaculty(){
		System.out.println("Faculty Name: "+name);
	}
	public String getName(){
		return name;
	}
}
class Department{
	private String deptName;
	public Department(String deptName){
		this.deptName = deptName;
	}
	public void displayDepartment(){
		System.out.println("Department name: "+deptName);
	}
}
class University{
	private String uniName;
	private ArrayList<Department> departments;
	private ArrayList<Faculty> faculties;
	public University(String uniName){
		this.uniName = uniName;
		departments = new ArrayList<>();
		faculties = new ArrayList<>();
	}
	public void addDepartment(Department dept) {
        departments.add(dept);
    }
	public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
	public void displayUniversity(){
		System.out.println("University Name: " + uniName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
	}
	public void deleteUniversity() {
        departments.clear(); 
        System.out.println("University " + uniName + " is deleted.");
    }
}
public class UniversitySystem {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Rani");
        Faculty f2 = new Faculty("Revanth");
        University uni = new University("SRM");
        Department d1 = new Department("CSE");
        Department d2 = new Department("Mechanical");
        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.displayUniversity();
        uni.deleteUniversity();
		
        System.out.println("\nFaculty members still exist after University is deleted:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}