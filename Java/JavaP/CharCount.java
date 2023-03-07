// WAP to count number of occurence of the given character in the given string.
import java.util.Scanner;
class CharCount
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String t=s.nextLine();
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		int count=0;
		for (int i=0;i<t.length() ;i++ )
		{
			if (c==t.charAt(i))
			{
				count++;
			}
		}
		System.out.println(c+" occur"+count+" times");
	}
}
