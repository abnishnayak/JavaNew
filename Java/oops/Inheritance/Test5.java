class Test5 
{
	public static void main(String[] args) 
	{
		System.out.println("System starting...");
		MusicPhone m1=new MusicPhone();
		m1.playMusic();
		CameraPhone c1=new CameraPhone();
		c1.takePhoto();
	}
}
class Phone
{
	void call(){
		System.out.println("calling...");
	}
}
class CameraPhone extends Phone
{
	void takePhoto(){
		super.call();
		System.out.println("photo captured...");
	}
}
class MusicPhone extends Phone
{
	void playMusic(){
		super.call();
		System.out.println("playing music...");
	}
}