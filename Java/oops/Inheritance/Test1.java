class Test1 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.i=10;
		b1.j=20;
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
class A
{
	int i;
}
class B extends A
{
	int j;
}