class A
{
	static int i=10;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(A.i);
		System.out.println(Test1.j);
		System.out.println("main ends");
	}
}
class Test1
{
	static int j=20;
}
