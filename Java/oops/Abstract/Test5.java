class Test5 
{
	public static void main(String[] args) 
	{
		K k1=new K();
		M m=new N();
		m.m1(k1);
	}
}
class K
{
}
class L extends K
{
}
class M
{
	void m1(K arg){
		System.out.println("m1(k) in M");
	}
	void m1(L arg){
		System.out.println("m1(L) in M");
	}
}
class N extends M
{
	void m1(K arg){
		System.out.println("m1(K) in N");
	}
	void m1(L arg){
		System.out.println("m1(L) in N");
	}
}