class Test6 
{
	public static void main(String[] args) 
	{
		R r1=new S();
		System.out.println(r1.i);// early binding
		System.out.println(r1.get());//late binding
	}
}
class R
{
	int i=10;
	int get(){
		return i;
	}
}
class S extends R
{
	int j=20;
	int get(){
		return i;
	}
}