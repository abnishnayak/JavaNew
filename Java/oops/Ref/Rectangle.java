class Rectangle 
{
	int length;
	int breadth;
	void init(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void display()
	{
		System.out.println(length+" "+breadth);
	}
}
class Test5
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		r1.init(20,50);
		r1.display();
	}
}
