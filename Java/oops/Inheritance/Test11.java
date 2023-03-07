class Test11 
{
	public static void main(String[] args) 
	{
		Doctor d=new Doctor();
		d.name="Dr.Sandeep";
		d.spec="Cardiology";
		d.display();
	}
}
class Human
{
	String name;
	void display(){
		System.out.println("Name="+name);
	}
}
class Doctor extends Human
{
	String spec;
	void display(){
		super.display();
		System.out.println("Specialist in "+spec);
	}
}