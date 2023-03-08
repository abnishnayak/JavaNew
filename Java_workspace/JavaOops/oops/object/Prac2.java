package oops.object;

public class Prac2 {

	public static void main(String[] args) {
		Car c=new Car("Black");
		System.out.println(c.color);
		
		changeColor(c);
		System.out.println(c.color);
	}
	static void changeColor(Car c) {
		c.color="White";
		System.out.println("color of car is changed to white from black.");
	}

}
class Car{
	String color;
	Car(String c){
		color=c;
	}
}