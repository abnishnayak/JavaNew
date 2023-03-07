class Box
{
	int height;
	int length;
	int width;
	Box(){
	}
		Box(int h, int l, int w){
			height=h;
			length=l;
			width=w;
		}
		Box(int n){
			this(n,n,n);
		}
		void display(){
			System.out.println("["+height+","+length+","+width+"]");
		}
}
class Test7 
{
	public static void main(String[] args) 
	{
		Box b1=new Box(1, 2, 3);
		b1.display();
		Box b2=new Box();
		b2.display();
		Box b3=new Box(4);
		b3.display();
	}
}
