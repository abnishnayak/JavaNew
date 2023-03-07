class Test5 
{
	public static void main(String[] args) 
	{
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		Rider r1= new Rider();
		r1.ride(b3);
		r1.ride(b1);
		r1.ride(b2);
	}
}
class Rider
{
	void ride(Bike b){
		b.start();
		b.accelerate();
		b.stop();
		System.out.println("------------");
	}
}
class Bike
{
	int num;
	private static int n=1000;
	Bike(){
		num=n;
		n++;
	}
	void start(){
		System.out.println(num+" bike starts");
	}
	void accelerate(){
		System.out.println(num+" bike accelerates");
	}
	void stop(){
		System.out.println(num+" bike stopped");
	}
}