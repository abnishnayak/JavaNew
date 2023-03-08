package oops.ctt;

public class G {
	public static void main(String[] args) {
		Test6 t=new Test6();
		//Test6 t1=new Test6(10);
		
		System.out.println(t.i);
		System.out.println(t.j);
		
		//System.out.println(t1.i);
		//System.out.println(t1.j);
	}

}
class Test6{
	int i;
	int j;
	Test6(){
		i=10;
		j=62;
	}
	Test6(int arg){
		i=84;
		j=arg;
	}
}