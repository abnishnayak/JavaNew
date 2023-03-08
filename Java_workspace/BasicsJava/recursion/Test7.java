package recursion;

public class Test7 {

	public static void main(String[] args) {
		int result=fact(16);
		System.out.println("result= "+result);
	}
	static int fact(int n){
		if(n==0) return 1;
		return fact (n-1)*n;
	}
}
//factorial without loops