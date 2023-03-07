class Test1 
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.setRadius(30);
		int r=c1.getRadius();
		System.out.println(r);
	}
}
class Circle
{
	private int radius;
	//setter
	public void setRadius(int radius){
		this.radius=radius;
	}
	//getter
	public int getRadius(){
		return radius;
	}
}