class Test2 
{
	public static void main(String[] args) 
	{
		new C();
		new C();
		new C();
	}
}
class C
{
	{
		System.out.println("non-static block in class C");
	}
	C(){
		System.out.println("constructor in class C");
	}
}