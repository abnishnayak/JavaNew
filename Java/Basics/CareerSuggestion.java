import java.util.Scanner;
class CareerSuggestion
{
	public static void main(String[] args) 
	{
		Scanner q= new Scanner(System.in);
		System.out.println("Enter your marks");
		double marks=q.nextDouble();
		if(marks>=90)
		{
			System.out.println("Go for MBBS");
		}
		else if(marks<90 && marks>=60)
		{
			System.out.println("Go for engineering");
		}
		else if(marks<60 && marks>=35)
		{
			System.out.println("Go for BSc., BCA");
		}
		else if(marks<35)
		{
			System.out.println("Go for politics");
		}
	}
}
