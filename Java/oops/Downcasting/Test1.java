class Test1 
{
	public static void main(String[] args) 
	{
		A a1=new B();
		((B)a1).m2();
	}
}
class A
{
}
class B extends A
{
	void m2(){
		System.out.println("m2 in B");
	}
}