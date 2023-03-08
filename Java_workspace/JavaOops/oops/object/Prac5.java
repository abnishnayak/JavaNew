package oops.object;

public class Prac5 {

	public static void main(String[] args) {
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		
		Rider r=new Rider();
		r.ride(b3);
		r.ride(b1);
		r.ride(b2);
	}

}
class Rider{
	void ride(Bike b) {
		b.start();
		b.accelerate();
		b.stop();
	}
}
class Bike{
	int num;
	private static int n=6846;
	Bike(){
		num=n;
		n++;
	}
	void start() {
		System.out.println(num+" bike starts.");
	}
	void accelerate() {
		System.out.println(num+" bike accelerates.");
	}
	void stop() {
		System.out.println(num+" bike stopped.");
	}
}