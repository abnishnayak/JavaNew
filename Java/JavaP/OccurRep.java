//WAP to count number of occurence of the given character and the given string without using if condition.
import java.util.Scanner;
class OccurRep
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=s.nextLine();
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		int count=a.length()-a.replace(c+"","").length();
		System.out.println(c+" occur "+count+" times.");
	}
}
