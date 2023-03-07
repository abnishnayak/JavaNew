class Test3 
{
	public static void main(String[] args) 
	{
		new D();
		System.out.println("_________");
		new D(10);
	}
}
class D
{
	{
		System.out.println("non-static block in class D");
	}
	D(){
		System.out.println("default constructor in class D");
	}
	D(int i){
		System.out.println("parameterized constructor in class D");
	}
}