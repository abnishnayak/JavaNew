package oops.binding;

public class B5 {

	public static void main(String[] args) {
		Home h=new Home();
		h.a=new Dog();
		h.hit();
		System.out.println("-------------------");
		Home H=new Home();
		H.a=new Cat();
		H.hit();
	}
}
class Animal{
	void makeSound() {}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Bark");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow");
	}
}
class Home{
	Animal a;
	void hit() {
		a.makeSound();
	}
}