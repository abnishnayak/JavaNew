package oops.Abstract;

public class Abs3 {

	public static void main(String[] args) {
		Abs3 a=new Abs3();
		a.m1(null);
	}
	void m1(Animal a) {
		System.out.println("m1(Animal)");
	}
	void m1(Dog d) {
		System.out.println("m1(Dog)");// calls the most specific method
	}
	/*void m1(Cat c) {
		System.out.println("m1(Cat)"); ambiguity to call
	}*/
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}