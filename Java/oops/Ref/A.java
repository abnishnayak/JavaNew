class A 
{
	static int i;
	void m1()
	{
		int i=50;
		System.out.println(i);
		System.out.println(A.i);
	}
}
class Test3
{
	public static void main(String[] args) 
	{
		A.i=10;
		A a1=new A();
		a1.m1();
	}
}
