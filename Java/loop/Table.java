import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=t.nextInt();
		for (int i=1;i<=10 ;i++ )
		{
			int r=num*i;
			System.out.println(num+"*"+i+"="+r);
		}
	}
}
