package oops.downcasting;

public class Dc2 {

	public static void main(String[] args) {
		G g=new H();
		//g.m2(); error
		((H)g).m2();//down casting
		H h=(H)g;// down casting
		h.m2();
	}
}
class G{}
class H extends G{
	void m2() {
		System.out.println("m2 in H");
	}
}