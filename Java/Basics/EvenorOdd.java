import java.util.Scanner;
class EvenorOdd 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=a.nextInt();
		int b=num%2;
		if(b==0)
		{
			System.out.println(num+" is even.");
		}
		else
		{
			System.out.println(num+" is odd.");
		}
	}
}
