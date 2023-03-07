class Test10 
{
	public static void main(String[] args) 
	{
		L l1=new L();
		l1.m1();
		l1.m1(10);
	}
}
class K
{
	void m1(){
		System.out.println("m1() in K");
	}
}
class L extends K
{
	void m1(int a){
		System.out.println("m1(int a) in L");
	}
}