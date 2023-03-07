class C 
{
	public static void main(String[] args) 
	{
		m1(15); //auto widening
		m1(15L);
		long n=16;
		m1(n);
	}
	static void m1(int i)
	{
		System.out.println("m1(int)");
	}
	static void m1(long l)
	{
		System.out.println("m1(long)");
	}

}
