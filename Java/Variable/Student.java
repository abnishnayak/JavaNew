class  Student
{
	String name;
	double marks;
	String city;
	static String institute;
}
class User
{
	public static void main(String[] args) 
	{
		Student.abnishInfo= new Student();
		abnishInfo.name="abnish";
		abnishInfo.marks=73.05;
		abnishInfo.city="Sambalpur";
		
		Student.manasInfo= new Student();
		manasInfo.name="manas";
		manasInfo.marks=89.56;
		manasInfo.city="Rourkela";

		Student.sunilInfo= new Student();
		sunilInfo.name="sunil";
		sunilInfo.marks=90.25;
		sunilInfo.city="Berhampur";

		Student.institute="Jspiders";
	}
}
