package oops.blocks;

public class Test3 {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.num+"\t"+c.color);
		
		Car C=new Car();
		System.out.println(C.num+"\t"+C.color);
	}
}
class Car{
	int num;
	String color;
	private static int n=6845;
	{
		num=n++;
	}
	Car(){
		color="white";
	}
	Car(String c){
		color=c;
	}
}