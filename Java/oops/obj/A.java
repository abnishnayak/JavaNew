class  Test1
{
	public static void main(String[] args) 
	{
		A a1=new A(10);
		m1(a1);
		A a2=new A(20);
		m1(a2);
	}
	static void m1(A arg){
		System.out.println("m1 starts");
		System.out.println(arg.i);
		System.out.println("m1 ends");
	}
}
class A
{
	int i;
	A(int i){
		this.i=i;
	}
}