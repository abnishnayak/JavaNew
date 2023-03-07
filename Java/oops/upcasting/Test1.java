class Test1
{
	public static void main(String[] args) 
	{
		Phone p1=new Phone();
		p1.insertSim(new Airtel());
		Phone p2=new Phone();
		p2.insertSim(new Jio());
	}
}
class Sim
{
}
class Airtel extends Sim
{
}
class Jio extends Sim
{
}
class Phone
{
	Sim s;
	void insertSim(Sim s){
		this.s=s;
		System.out.println("Sim inserted");
	}
}