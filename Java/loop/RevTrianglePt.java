import java.util.Scanner;
class RevTrianglePt
{
	public static void main(String[] args) 
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter size");
		int size=d.nextInt();
		for (int i=1;i<=size ;i++ )
		{
			for (int k=size;k>=i ;k-- )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
