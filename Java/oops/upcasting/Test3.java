class Test3 
{
	public static void main(String[] args) 
	{
		A a1=new B();
		a1.m1();//late binding
		a1=new C();
		a1.m1();//late binding
	}
}
class A
{
	void m1(){
		System.out.println("m1 in A");
	}
}
class B extends A
{
	void m1(){
		System.out.println("m1 in B");
	}
}
class C extends A
{
	void m1(){
		System.out.println("m1 in C");
	}
}