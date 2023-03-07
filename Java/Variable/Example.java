class  Example
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Test.m1();
		System.out.println("main ends");
	}
}
class Test
{
	public static void m1()
	{
		System.out.println("m1 starts");
		System.out.println("m1 ends");
	}
}