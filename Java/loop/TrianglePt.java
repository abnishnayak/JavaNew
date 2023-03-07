import java.util.Scanner;
class TrianglePt
{
	public static void main(String[] args) 
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter size");
		int size=d.nextInt();
		for (int i=1;i<=size ;i++ )
		{
			for (int k=1;k<=i ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
