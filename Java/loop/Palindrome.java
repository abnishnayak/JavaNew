import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner t= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=t.nextInt();
		int temp=num;
		int r=0;
		int d=0;
		while (num!=0)
		{
			d=num%10;
			r=r*10+d;
			num=num/10;
		}
		if(r==temp)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}
}
