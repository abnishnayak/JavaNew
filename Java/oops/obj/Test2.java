class Test2 
{
	public static void main(String[] args) 
	{
		Car c1=new Car("black");
		System.out.println(c1.Color);
		changeColor(c1);
		System.out.println(c1.Color);
	}
	static void changeColor(Car C){
		C.Color="red";
		System.out.println("changeColor() is executed.");
	}
}
class Car
{
	String Color;
	Car(String C){
		Color=C;
	}
}