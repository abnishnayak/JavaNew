package oops.encapsulation;

public class Encap4 {

	public static void main(String[] args) {
		Name n=new Name();
		n.setAge(22);
		System.out.println("The age of the person is "+n.getAge());
	}
}
class Name{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}