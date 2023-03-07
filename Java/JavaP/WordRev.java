import java.util.Scanner;
class WordRev 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a word");
		String w=a.next();
		String rev="";
		for (int i=w.length()-1;i>=0 ;i-- )
		{
			rev=rev+w.charAt(i);
		}
		System.out.println(rev);
	}
}
