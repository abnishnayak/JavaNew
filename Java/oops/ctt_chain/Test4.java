class Test4 
{
	public static void main(String[] args) 
	{
		Doctor d=new Doctor("Dr.Kiran","Cardio");
		System.out.println(d.name);
		System.out.println(d.spec);
	}
}
class Human
{
	String name;
	Human(String n){
		name=n;
	}
}
class Doctor extends Human
{
	String spec;
	Doctor(String n, String s){
		super(n);
		spec=s;
	}
}