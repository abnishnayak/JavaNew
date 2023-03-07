class B
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	static void m1(int a)
	{
		System.out.println(a);
		if(a>=100)
			return;
		m1(a+1);
	}
}
