class Test1 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.a=new A(10);
		b1.m1();
		b1.m1();
		B b2=new B();
		b2.a=new A(20);
		b2.m1();
		b2.m1();
	}
}
class A
{
	int i;
	A(int i){
		this.i=i;
	}
}
class B
{
	A a;
	void m1(){
		System.out.println("m1 starts");
		System.out.println(a.i);
		System.out.println("m1 ends");
	}
}