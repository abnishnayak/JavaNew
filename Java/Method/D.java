class D 
{
	public static void main(String[] args) 
	{
		m1(10,2.5);
		m1(3.6,9);
		m1(6,5); //compile time error
	}
	static void m1(int i, double d)
	{
		System.out.println("m1(int,double)");
	}
	static void m1(double d, int i)
	{
		System.out.println("m1(double,int)");
	}
}
