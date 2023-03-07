import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number");
		int b=a.nextInt();
		int c=fact(b);
		System.out.println("factorial="+c);
	}
	static int fact(int n)
	{
		if(n==0) return 1;
		return fact(n-1)*n;
	}
}
