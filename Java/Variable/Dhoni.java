class Example 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Test.m1();
		System.out.println(Test.w);
		System.out.println(Test.k);
		Test abc= new Test();
		System.out.println(abc.t);
		abc.m2();
		System.out.println("main ends");
	}
}
class Test
{
     static int w=85;
 static int k=65;
 double t=45.21;
public static void m1()
	{
	  System.out.println("m1 starts");
	  System.out.println("m1 ends");
	}
	public void m2()
	{
		 System.out.println("m2 starts");
		 System.out.println("m2 ends");
	}
}
