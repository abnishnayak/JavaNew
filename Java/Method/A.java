class A
{
	static void m1()
	{
		System.out.println("m1()");
	}
	static void m1(int i)
	{
		System.out.println("m1(int)");
	}
	static void m1(double d)
	{
		System.out.println("m1(double)");
	}
	public static void main(String[] args) 
	{
		m1();
		m1(105);
		m1(5.5);
	}
}
