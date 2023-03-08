package oops.Final;

public class Test1 {

	public static void main(String[] args) {
		Account a=new Account();
		Account A=new Account();
		System.out.println(a.accNo);
		System.out.println(A.accNo);
	}
}
class Account{
	final int accNo;
	private static int n=100;
	{
		accNo=n;
		n++;
	}
}