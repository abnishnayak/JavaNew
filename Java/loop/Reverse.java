import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner t= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=t.nextInt();
		int r=0;
		int d=0;
		while (num!=0)
		{
			d=num%10;
			r=r*10+d;
			num=num/10;
		}
		System.out.println("Reverse of the number is "+r);
	}
}
