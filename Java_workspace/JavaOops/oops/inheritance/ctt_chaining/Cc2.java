package oops.inheritance.ctt_chaining;

public class Cc2 {

	public static void main(String[] args) {
		Doctor d=new Doctor("Dr.Josh","Cardiologist");
		System.out.println(d.name);
		System.out.println(d.speciality);
	}
}
class Human{
	String name;
	Human(String n){
		name=n;
	}
}
class Doctor extends Human{
	String speciality;
	Doctor(String n,String s){
		super(n);
		speciality=s;
	}
}