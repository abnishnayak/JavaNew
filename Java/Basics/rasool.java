class Demo10 
{
	public static void main(String[] args) 
	{
		System.out.println("maian() starts");
		m1();
		System.out.println("main()ends");

	}
	public static void m1()
	{
		System.out.println("m1()starts");
		Demo11.m2();
		System.out.println("m1()ends");


}
public static void m2()
	{
	System.out.println("m2() starts");
System.out.println("m2() ends");
	}
}
