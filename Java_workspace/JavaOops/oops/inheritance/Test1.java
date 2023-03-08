package oops.inheritance;

public class Test1 {

	public static void main(String[] args) {
		Doctor d=new Doctor();
		d.name= "Dr.Trevis";
		d.specialist="Neurologist";
		d.display();
	}
}
class Humans{
	String name;
	void display() {
		System.out.println("name= "+name);
	}
}
class Doctor extends Humans{
	String specialist;
	void display() {
		super.display();
		System.out.println("Speciality= "+specialist);
	}
}