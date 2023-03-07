class Test6 
{
	public static void main(String[] args) 
	{
		I a=new I();
		a.display();
	}
}
class H
{
	int k=56;
	public void m1(){
		System.out.println("m1 method of class H");
	}
}
class I extends H
{
	int m=15;
	public void display(){
		System.out.println(m);
		System.out.println(super.k);
		super.m1();
	}
}