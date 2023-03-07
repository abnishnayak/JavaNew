class Test3 
{
	public static void main(String[] args) 
	{
		B b1=new B(10);
		B b2=new B(20);
		b1.display(b2);
	}
}
class B
{
	int i;
	B(int i){
		this.i=i;
	}
	void display(B arg){
		System.out.println(i);
		System.out.println(arg.i);
	}
}