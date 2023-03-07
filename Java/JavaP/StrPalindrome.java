import java.util.Scanner;
class StrPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a word");
		String w=s.next();
		String pal="";
		for (int i=w.length()-1;i>=0 ;i-- )
		{
			pal=pal+w.charAt(i);
		}
		if (pal.equals(w))
		{
			System.out.println(pal+" is a palindrome word.");
		}
		else
		{
			System.out.println(pal+" is not a palindrome.");
		}
	}
}
