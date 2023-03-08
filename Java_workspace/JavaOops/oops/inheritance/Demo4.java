package oops.inheritance;

public class Demo4 {

	public static void main(String[] args) {
		CameraPhone c=new CameraPhone();
		c.takePhoto();
		c.call();
		System.out.println("---------------");
		MusicPhone m=new MusicPhone();
		m.playMusic();
		m.call();
	}

}
class Phone{
	void call() {
		System.out.println("Calling capability.");
	}
}
class CameraPhone extends Phone{
	void takePhoto() {
		System.out.println("Photo Capturing.");
	}
}
class MusicPhone extends Phone{
	void playMusic() {
		System.out.println("Playing music");
	}
}