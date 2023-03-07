class Test3 
{
	public static void main(String[] args) 
	{
		Phone p1=new Phone(new Sim());
		p1.speak();
	}
}
class Sim
{
	void connectCall(){
		System.out.println("call connected");
	}
}
class Phone
{
	Sim s;
	Phone(Sim s){
		this.s=s;
	}
	void speak(){
		s.connectCall();
		System.out.println("speaking");
	}
}