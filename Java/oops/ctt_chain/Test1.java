class Test1 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println("b1.i="+b1.i);
		System.out.println("b1.j="+b1.j);
	}
}
class A
{
	int i;
	A(){
		System.out.println("constructor in class A");
		i=10;
	}
}
class B extends A
{
	int j;
	B(){
		super();
		System.out.println("constructor in class B");
		j=20;
	}
}