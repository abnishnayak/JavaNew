//WAP to convert all the letters of the given string to lowercase without using toLowerCase() method.
import java.util.Scanner;
class LowerCase
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
			if (c>='A' && c<='Z')
			{
				c=(char)(c+32);
			}
			t=t+c;
		}
		System.out.println(t);
	}
}