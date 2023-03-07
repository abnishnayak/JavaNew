class D 
{
	int i;
	static int j;
	void inc()
	{
		++i;
		++j;
	}
	void display()
	{
		System.out.println(i+" "+j);
	}
}
class Test7
{
	public static void main(String[] args) 
	{
		D d1=new D();
		D d2=new D();
		D d3=new D();
		d1.inc();
		d2.inc();
		d3.inc();
		d1.display();
		d2.display();
		d3.display();
	}
}
