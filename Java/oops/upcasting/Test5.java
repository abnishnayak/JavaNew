class Test5 
{
	public static void main(String[] args) 
	{
		P p1=new Q();
		p1.m1();//early binding
	}
}
class P
{
	static void m1(){
		System.out.println("static m1 in P");
	}
}
class Q extends P
{
	static void m1(){
		System.out.println("static m1 in Q");
	}
}