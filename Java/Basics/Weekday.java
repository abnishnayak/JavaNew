import java.util.Scanner;
class  Weekday
{
	public static void main(String[] args) 
	{
		Scanner d= new Scanner(System.in);
		System.out.println("Enter three letter of any day");
		String s=d.next();
		switch(s)
		{
			case "sun": System.out.println("sunday"); break;
			case "mon": System.out.println("monday"); break;
			case "tue": System.out.println("tueday"); break;
			case "wed": System.out.println("wednesday"); break;
			case "thu": System.out.println("thursday"); break;
			case "fri": System.out.println("friday"); break;
			case "sat": System.out.println("saturday"); break;
			default: System.out.println("No match found"); break;
		}
	}
}
