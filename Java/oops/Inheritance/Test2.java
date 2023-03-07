class Test2 
{
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.x=10;
		d1.y=20;
		d1.display();
		d1.show();
	}
}
class C
{
	int x;
	void display(){
		System.out.println("x="+x);
	}
}
class D extends C
{
	int y;
	void show(){
		System.out.println("x="+x+"\ty="+y);
	}
}