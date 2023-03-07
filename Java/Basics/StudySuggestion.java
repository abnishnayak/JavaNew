import java.util.Scanner;
class StudySuggestion 
{
	public static void main(String[] args) 
	{
		Scanner c= new Scanner(System.in);
		System.out.println("Enter the remaining number of days for exam");
		int day=c.nextInt();
		if(day>=30)
		{
			System.out.println("read one chapter per day");
		}
		else if(day<30 && day>=15)
		{
			System.out.println("read two chapters per day");
		}
		else if(day<15 && day>=5)
		{
			System.out.println("read one subject per day");
		}
		else if(day<5 && day>=2)
		{
			System.out.println("read two chapters per day");
		}
		else
		{
			System.out.println("visit holy place for prayer");
		}
	}
}
