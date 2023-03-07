class B 
{
	//method
	void B(){
		System.out.println("method B() is executed");
	}
}
class Test3
{
	public static void main(String[] args) 
	{
		B b1=new B(); // default ctt executed
		b1.B(); //calling non-static method
	}
}
