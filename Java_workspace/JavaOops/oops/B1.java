package oops;

public class B1 {

	public static void main(String[] args) {
		Demo2 a=new Demo2();
		Demo2 b=new Demo2();
		Demo2 c=new Demo2();
		
		a.inc();
		b.inc();
		c.inc();
		
		a.display();
		b.display();
		c.display();
	}

}
class Demo2{
	int i;
	static int j;
	void inc(){
		++i;
		++j;
	}
	void display() {
		System.out.println(i+" "+j);
	}
}