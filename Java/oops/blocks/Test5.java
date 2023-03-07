class Test5
{
	public static void main(String[] args) 
	{
		new L();
	}
}
class K
{
	static {
		System.out.println("Static block in K");
	}
	{
		System.out.println("non-static block in K");
	}
	K(){
		System.out.println("constructor in K");
	}
}
class L
{
	static {
		System.out.println("static block in L");
	}
	{
		System.out.println("non-static block in L");
	}
	L(){
		System.out.println("constructor in L");
	}
}