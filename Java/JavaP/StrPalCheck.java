//WAP to check a string is a palindrome or not, without reversing it.
import java.util.Scanner;
class StrPalCheck
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String t=s.nextLine();
		int i=0;
		int j=t.length()-1;
		boolean k=true;
		while (i<=j)
		{
			if (t.charAt(i)!=t.charAt(j))
			{
				k=false;
				break;
			}
			i++;
			--j;
		}
		if (k)
		{
			System.out.println("String is Palindrome.");
		}
		else 
		{
			System.out.println("String is not Palindrome.");
		}
	}
}
