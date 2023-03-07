class Account 
{
	double bal;
	int accno;
	void displayBal()
	{
		System.out.println("Current balance= "+bal);
	}
	void withDraw(int amt)
	{
		if (amt>bal)
		{
			System.out.println("Withdraw Failed.");
			return;
		}
			bal-=amt;
			System.out.println(amt+" is drawn.");
			System.out.println("Current balance= "+bal);
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		Account a1=new Account();
		a1.accno=5316972;
		a1.bal=5000;
		a1.displayBal();
		a1.withDraw(4999);
	}
}
