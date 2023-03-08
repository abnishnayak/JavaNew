package oops.binding;

public class B4 {

	public static void main(String[] args) {
		F f=new G();
		System.out.println(f.i);//early binding 
		System.out.println(f.get());// late binding
	}
}
class F{
	int i=10;
	int get() {
		return i;
	}
}
class G extends F{
	int j=20;
	int get() {
		return j;
	}
}