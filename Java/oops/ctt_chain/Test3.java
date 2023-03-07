class Test3 
{
	public static void main(String[] args) 
	{
		G g1=new G();
	}
}
class F
{
	F(int i){
		System.out.println("class F");
	}
}
class G extends F
{
	G(){
		super(10);
		System.out.println("class G");
	}
}