package oops.Interface;

public class Inf {

	public static void main(String[] args) {
		Phone p=new Iphone();
		p.call();
		Camera c=new Iphone();
		c.takePhoto();
	}
}
interface Phone{
	void call();
}
interface Camera{
	void takePhoto();
}
class Iphone implements Phone, Camera{
	public void call() {
		System.out.println("calling using iphone");
	}
	public void takePhoto() {
		System.out.println("shot on iphone");
	}
}