class Test3 
{
	public static void main(String[] args) 
	{
		E e1=new E();
		e1.m1();
		F f1=new F();
		f1.m1();
		f1.m2();
		G g1=new G();
		g1.m1();
		g1.m2();
		g1.m3();
	}
}
class E
{
	void m1(){
		int i=10;
		System.out.println(i);
	}
}
class F extends E
{
	void m2(){
		int j=20;
		System.out.println(j);
	}
}
class G extends F
{
	void m3(){
		int k=30;
		System.out.println(k);
	}
}