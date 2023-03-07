class Test9 
{
	public static void main(String[] args) 
	{
		Snake s=new Snake();
		s.move();
	}
}
class Animal
{
	void move(){
		System.out.println("Running");
	}
}
class Snake extends Animal
{
	void move(){
		System.out.println("Crawling");
	}
}