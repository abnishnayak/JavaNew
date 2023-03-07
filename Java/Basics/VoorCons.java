import java.util.Scanner;
class  VoorCons
{
	public static void main(String[] args) 
	{
		Scanner g=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char c=g.next().charAt(0);
		switch(c)
		{
			case 'a','A':
			case 'e','E':
			case 'i','I':
			case 'o','O':
			case 'u','U':System.out.println("Vowel"); break;
			default:System.out.println("Consonant"); break;
		}
	}
}
