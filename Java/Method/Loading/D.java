class D 
{
	int i;
	void m1()
	{
		System.out.println(i);
	}
}
class Test3
{
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.i=10;
		D d2=new D();
		d2.i=20;
		d1.m1();
		d2.m1();
	}
}
