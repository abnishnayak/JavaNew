class Test2 
{
	public static void main(String[] args) 
	{
		Driver d1=new Driver();
		d1.drive(new Audi());
		d1.drive(new Benz());
	}
}
class Car
{
}
class Audi extends Car
{
}
class Benz extends Car
{
}
class Driver
{
	void drive(Car c){
		System.out.println("driving...");
	}
}