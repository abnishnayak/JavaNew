import java.util.Scanner;
class TailingZero 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int f=1;
		for (int i=1;i<=n ;i++ )
		{
			f*=i;
		}
		int d=0;
		int count=0;
		while (f!=0)
		{
			d=f%10;
			if (d!=0)
			{
				break;
			}
			count++;
			f/=10;
		}
		System.out.println("Tailing zeros="+count);
	}
}
