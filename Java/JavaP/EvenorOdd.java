//WAP to check a number is even or odd without using modulus operator.
import java.util.Scanner;
class EvenorOdd 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int t=(n/2)*2;
		if (n==t)
		{
			System.out.println(n+" is an even number");
		}
		else {
			System.out.println(n+" is an odd number");
		}
	}
}
