import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=a.nextInt();
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}

			if (count==2)
				{
					System.out.println("Number is prime");
				}
			else
				{
					System.out.println("Number is composite");
				}
		}
	}
