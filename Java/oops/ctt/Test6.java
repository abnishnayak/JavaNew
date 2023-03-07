class D
{
	D(){
		new D(10);
	}
	D(int i){
	}
}
class Test6 
{
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println(d1);
	}
}
