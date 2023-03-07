class Test2 
{
	public static void main(String[] args) 
	{
		E e1=new E();
	}
}
class C
{
	C(){
		System.out.println("constructor in class C");
	}
}
class D extends C
{
	D(){
		System.out.println("constructor in class D");
	}
}
class E extends D
{
	E(){
		System.out.println("constructor in class E");
	}
}