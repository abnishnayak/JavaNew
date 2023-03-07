import java.util.Scanner;
class Digit 
{
	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=t.nextInt();
		int count=0;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Number of digits= "+count);
	}
}
