class Test5 
{
	public static void main(String[] args) 
	{
		new Y();
		System.out.println("__________");
		new Y(10);
	}
}
class X
{
	X(){
		System.out.println("X()");
	}
}
class Y
{
	Y(){
		this(10);
		System.out.println("Y()");
	}
	Y(int i){
		//implicitly super();
		System.out.println("Y(int i)");
	}
}