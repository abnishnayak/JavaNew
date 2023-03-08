package oops.inheritance;

public class Demo6 {

	public static void main(String[] args) {
		Human h=new Human();
		h.eating();
		h.sleeping();
		System.out.println("------------------");
		Dog d=new Dog();
		d.eating();
		d.sleeping();
	}
}
class Animal{
	public void eating() {
		System.out.println("Animal eats food");
	}
	public void sleeping() {
		System.out.println("Sleeping...");
	}
}
class Human extends Animal{
	public void eating() {
		System.out.println("Human eats food");
		System.out.println("Human loves to eat non-veg");
	}
}
class Dog extends Animal{
	public void eating() {
		System.out.println("Dog eats food");
	}
}