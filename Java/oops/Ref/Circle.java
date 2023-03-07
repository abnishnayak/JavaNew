class Circle 
{
	int radius;
}
class Test1
{
	public static void main(String[] args) 
	{
		Circle c1;
		c1=new Circle();
		c1.radius=10;
		Circle c2=c1;
		System.out.println(c2.radius);
		c2.radius=50;
		System.out.println(c2.radius);
	}
}
class Test2 
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.radius=50;
		System.out.println(c1.radius);
		c1=new Circle();
		System.out.println(c1.radius);
	}
}
