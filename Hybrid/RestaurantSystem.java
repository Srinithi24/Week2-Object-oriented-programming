interface Worker{
	void performDuties();
}
class Person{
	String name;
	int id;
	Person(String name, int id){
		this.name = name;
		this.id = id;
	}
	void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
class Chef extends Person implements Worker{
	Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking meals.");
    }
}
class Waiter extends Person implements Worker{
	Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving meals.");
    }
}
public class RestaurantSystem{
	public static void main(String[] args){
		Chef chef = new Chef("Bob", 34);
		Waiter waiter = new Waiter("Lucy", 56);
		chef.displayInfo();
		chef.performDuties();
		System.out.println();
		waiter.displayInfo();
		waiter.performDuties();
	}
}