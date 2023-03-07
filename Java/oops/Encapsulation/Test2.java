class Test2 
{
	public static void main(String[] args) 
	{
		Button b1= new Button();
		b1.setHeight(-8);
	}
}
class Button
{
	private int height;
	public void setHeight(int h){
		if(h<5) height=5;
		else height=h;
	}
}