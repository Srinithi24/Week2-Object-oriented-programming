import java.util.ArrayList;
class CompDept{
	static class Employee{
		private String name;
		private int empId;
		public Employee(String name, int empId){
			this.name = name;
			this.empId = empId;
		}
		public void destroy(){
			System.out.println("Employee "+ name +" with ID "+empId+" is deleted.");
		}
	}
	static class Department{
		private String deptName;
		private ArrayList<Employee> employees;
		public Department(String deptName){
			this.deptName = deptName;
			employees = new ArrayList<>();
		}
		public void addEmployee(String name, int empId){
			employees.add(new Employee(name, empId));
		}
		public void destroy(){
			System.out.println(" Department "+ deptName+ " is deleted.");
			for(Employee emp: employees){
				emp.destroy();
			}
		}
	}
	static class Company{
		private String companyName;
		private ArrayList<Department> departments;
		public Company(String companyName){
			this.companyName = companyName;
			departments = new ArrayList<>();
		}
		public Department addDepartment(String deptName){
			Department dept = new Department(deptName);
			departments.add(dept);
			return dept;
		}
		public void destroy(){
			System.out.println("Company " + companyName + " is being deleted.");
			for(Department dept : departments){
				dept.destroy();
			}
		}
	}
	public static void main(String[] args){
		Company company = new Company("ABC");
		Department dev = company.addDepartment("Development");
		dev.addEmployee("Anie",101);
		dev.addEmployee("Arun",102);
		Department hr = company.addDepartment("HR");
		hr.addEmployee("Charlie",204);
		company.destroy();
	}
}
