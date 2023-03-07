class Circle 
{
	int radius;
	Circle(int r){
		radius=r;
	}
	void displayArea(){
		System.out.println("Area="+(3.14*radius*radius));
	}
}
class Test4
{
	public static void main(String[] args)
	{
		Circle c1= new Circle(45);
		c1.displayArea();
		String s1=c1.toString();
		System.out.println(s1);
		int h=c1.hashCode();
		System.out.println(h);
	}
}