package oops.inheritance;

public class Example {

	public static void main(String[] args) {
		SmartPhone Asus=new SmartPhone();
		Asus.calling();
	}

}
class Phones{
	public void calling() {
		System.out.println("Call is connected.");
	}
}
class SmartPhone extends Phones{
	public void calling() {
		super.calling();
		System.out.println("wifi calling feature is used.");
	}
}