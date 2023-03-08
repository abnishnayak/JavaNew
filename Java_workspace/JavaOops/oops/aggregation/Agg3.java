package oops.aggregation;

public class Agg3 {

	public static void main(String[] args) {
		Phone p=new Phone(new Sim());
		p.speak();
	}
}
class Sim{
	void connectCall() {
		System.out.println("Calling...");
		System.out.println("Call connected");
	}
}
class Phone{
	Sim s;
	Phone(Sim s){
		this.s=s;
	}
	void speak() {
		s.connectCall();
		System.out.println("speaking...");
	}
}