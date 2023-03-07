import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=a.nextInt();
		int f=1;
		for (int i=1;i<=n ;i++ )
		{
			f*=i;
		}
		System.out.println("Factorial of the number="+f);
	}
}
