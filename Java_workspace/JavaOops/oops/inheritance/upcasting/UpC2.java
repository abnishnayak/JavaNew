package oops.inheritance.upcasting;

public class UpC2 {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.insertSim(new Jio());
		
		Phone P=new Phone();
		P.insertSim(new Airtel());
	}
}
class Sim{}
class Jio extends Sim{
	Jio(){
		System.out.println("Jio sim inserted.");
	}
}
class Airtel extends Sim{
	Airtel(){
		System.out.println("Airtel sim inserted.");
	}
}
class Phone{
	Sim s;
	void insertSim(Sim s) {
		this.s=s;
		System.out.println("Sim updated.");
	}
}