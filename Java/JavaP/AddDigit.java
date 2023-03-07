import java.util.Scanner;
class AddDigit 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=a.nextInt();
		while(n>9)
		{
			int sum=0;
			int m=n;
			while (m!=0)
			{
				int d=m%10;
				sum=sum+d;
				m=m/10;
			}
			n=sum;
		}
		System.out.println(n+" is the reduced digit.");
	}
}
