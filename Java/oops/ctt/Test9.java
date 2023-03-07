class Test9 
{
	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println(f1.i);
		System.out.println(f1.j);
	}
}
class F
{
	int i;
	int j;
	F(){
		i=10;
		j=20;
	}
	F(int arg){
		i=30;
		j=arg;
	}
}