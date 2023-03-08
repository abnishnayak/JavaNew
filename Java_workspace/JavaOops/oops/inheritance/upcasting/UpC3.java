package oops.inheritance.upcasting;

public class UpC3 {

	public static void main(String[] args) {
		Driver d=new Driver();
		d.drive(new Audi());
		d.drive(new Benz());
	}
}
class Car{
	Car(){
		System.out.println("Bought a car");
	}
}
class Audi extends Car{
	Audi(){
		System.out.println("It is an Audi");
	}
}
class Benz extends Car{
	Benz(){
		System.out.println("It is a Benz");
	}
}
class Driver{
	void drive(Car c) {
		System.out.println("Driving");
	}
}
class CarFactory{
	Car getCar(int i){
		if(i==1) {return new Audi();}
		if(i==2) {return new Benz();}
		return null;
	}
}