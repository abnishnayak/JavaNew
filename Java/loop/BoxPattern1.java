import java.util.Scanner;
class BoxPattern1 
{
	public static void main(String[] args) 
	{
		Scanner c= new Scanner(System.in);
		System.out.println("Enter Size");
		int size=c.nextInt();
		for (int i=1;i<=size ;i++ )
		{
			for (int k=1;k<=size ;k++ )
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}