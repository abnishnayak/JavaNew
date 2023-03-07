class Test1 
{
	static {
		System.out.println("static block in Test1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A.m1();
		A.m1();
	}
}
class A
{
	static{
		System.out.println("static block in A");
	}
	static void m1(){
		System.out.println("Static method m1 in A");
	}
}
