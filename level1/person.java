public class person{
	private String name;
	private int age;
	public person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public person(person copy){
		this(copy.name, copy.age);
	}
	@Override
	public String toString(){
		return "Name: "+name+" age: "+age;
	}
	public static void main(String[] args){
		person person1 = new person("Rony", 34);
		System.out.println("Original: "+person1);
		person person2 = new person(person1);
		System.out.println("Copy: "+person2);
	}
}