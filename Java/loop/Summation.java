import java.util.Scanner;
class Summation 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=a.nextInt();
		int s=0;
		for (int i=1;i<=n ;i++ )
		{
			s+=i;
		}
		System.out.println("Summation of the number="+s);
	}
}
