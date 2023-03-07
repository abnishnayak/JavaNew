class Test8 
{
	public static void main(String[] args) 
	{
		SmartPhone asus=new SmartPhone();
		asus.calling();
	}
}
class BasicPhone
{
	public void calling(){
		System.out.println("Call connected");
	}
}
class SmartPhone extends BasicPhone
{
	public void calling(){
		System.out.println("with 5G signal calling feature is used.");
	}
}