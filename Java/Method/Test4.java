class Rectangle 
{
	int length;
	int breadth;
	void init(int l, int b)
	{
		length=l;
		breadth=b;
	}
	void display()
	{
		System.out.println("[" +length+","+breadth+"]");
	}
}
class Test4
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		r1.init(10,20);
		Rectangle r2= new Rectangle();
		r2.init(30,40);
	}
}