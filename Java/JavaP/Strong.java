import java.util.Scanner;
class Strong 
{
	public static void main(String[] args) 
	{
		Scanner b=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=b.nextInt();
		int m=n;
		int d=0;
		int sum=0;
		while (n!=0)
		{
			d=n%10;
			int f=1;
			for (int i=1;i<=d ;i++ )
			{
				f=f*i;
			}
			sum=sum+f;
			n=n/10;
		}
		if (sum==m)
		{
			System.out.println(m+" is a strong number.");
		}
		else 
		{
			System.out.println(m+" is not a strong number.");
		}
	}
}
