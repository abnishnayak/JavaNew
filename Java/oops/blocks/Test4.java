class Test4 
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		System.out.println(c1.num+"\t"+c1.color);
		Car c2=new Car();
		System.out.println(c2.num+"\t"+c2.color);
	}
}
class Car
{
	int num;
	String color;
	private static int n=1000;
	{
		num=n++;
	}
	Car(){
		color="black";
	}
	Car(String c){
		color=c;
	}
}