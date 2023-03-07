class Test1 
{
	public static void main(String[] args) 
	{
		Account a1=new Account();
		Account a2=new Account();
		System.out.println("a1.accNum="+a1.accNum);
		System.out.println("a2.accNum="+a2.accNum);
	}
}
class Account
{
	final int accNum;
	private static int n=1000;
	{
		accNum=n;
		n++;
	}
}