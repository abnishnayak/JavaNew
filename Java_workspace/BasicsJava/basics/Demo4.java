package basics;

public class Demo4 {
	String name;
	Double marks;
	String city;
	static String institute;
}
class User{
	public static void main(String[] args) {
		Demo4 d1=new Demo4();
		d1.name="Abnish";
		d1.marks=73.05;
		d1.city="Sambalpur";
		
		Demo4 d2=new Demo4();
		d2.name="Manas";
		d2.marks= 89.56;
		d2.city="Rourkela";
		
		Demo4 d3=new Demo4();
		d3.name="Sunil";
		d3.marks=90.80;
		d3.city="Berhampur";
		
		Demo4.institute="Jspiders";
		System.out.println(Demo4.institute);
	}
}
