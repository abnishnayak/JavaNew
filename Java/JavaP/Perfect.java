import java.util.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=a.nextInt();
		int sum=0;
		for (int i=1;i<=n/2 ;i++ )
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is perfect number.");
		}
		else
		{
			System.out.println(n+" is not perfect number.");
		}
	}
}
//Perfect Number program