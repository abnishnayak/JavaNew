class C 
{
	static int i;
	static void m1()
	{
		System.out.println(i);
	}
	void m2()
	{
		System.out.println(i);
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		C.m1();
		C c1= new C();
		c1.m2();

		C.i=100;
		C.m1();
		c1.m2();
	}
}
