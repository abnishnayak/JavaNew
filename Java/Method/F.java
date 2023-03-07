class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main(string[])");
		main();
		main(10);
	}
	public static void main()
	{
		System.out.println("main()");
	}
	public static void main(int a)
	{
		System.out.println("main(int a)");
	}
}
