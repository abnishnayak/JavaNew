//WAP to convert all the letters of the given string to uppercase without using toUpperCase() method.
import java.util.Scanner;
class UpperCase
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string.");
		String a=s.nextLine();
		String t="";
		for (int i=0;i<a.length() ;i++ )
		{
			char c=a.charAt(i);
			if (c>='a' && c<='z')
			{
				c=(char)(c-32);
			}
			t=t+c;
		}
		System.out.println(t);
	}
}
