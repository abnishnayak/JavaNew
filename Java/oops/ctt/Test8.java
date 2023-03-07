class Test8 
{
	public static void main(String[] args) 
	{
		new E(10); //instance is created, E(int) is executed
	}
}
class E
{
	E(){
	System.out.println("code of default constructor");
	}
	E(int i){
		this(); //calling ctt(new object is not created)
		System.out.println("code of parameterized constructor");
	}
}