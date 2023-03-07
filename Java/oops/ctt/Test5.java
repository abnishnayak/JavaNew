class C
{
	C(){
		System.out.println("Constructor without args");
	}
	C(int n){
			System.out.println("Constructor with 1 int args");
	}
	C(int n, int m){
		System.out.println("Constructor with 2 int args");
	}
}
class Test5
{
	public static void main(String[] args) 
	{
		new C(10);
		new C();
		new C(20,30);
		new C('a'); //auto-widening
	}
}
