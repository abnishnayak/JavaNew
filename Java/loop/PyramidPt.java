import java.util.Scanner;
class PyramidPt
{
	public static void main(String[] args) 
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter size");
		int size=d.nextInt();
		int space=size-1;
		int star=1;
		for (int i=1;i<=size ;i++ )
		{
			for (int k=1;k<=space ;k++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}
}
