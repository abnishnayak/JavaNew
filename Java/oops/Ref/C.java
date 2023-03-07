class C 
{
	int i;
	void m1(){
		System.out.println(this.i);
	}
	void m2()
	{
		this.m1();
	}
}
class Test6
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.i=50;
		c1.m2();
	}
}
