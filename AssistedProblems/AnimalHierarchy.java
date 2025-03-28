class Animal{
	String name;
	int age;
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	void makeSound(){
		System.out.println("Animal sound.");
	}
}
class Dog extends Animal{
	Dog(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound(){
		System.out.println(name +" sound: Bow Bow");
	}
}
class Cat extends Animal{
	Cat(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound(){
		System.out.println(name +" sound: Meow Meow");
	}
}
class Bird extends Animal{
	Bird(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound(){
		System.out.println(name +" sound: Chirp Chirp");
	}
}
public class AnimalHierarchy{
	public static void main(String[] args){
		Animal dog = new Dog("Jacky", 5);
		Animal cat = new Cat("Julie", 3);
		Animal bird = new Bird("Kiki", 2);
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}