class Test1
{
	public static void main(String[] args) 
	{
		Home h1=new Home();
		h1.a=new Dog();
		Home h2=new Home();
		h2.a=new Cat();
		h1.hit();
		h2.hit();
	}
}
class Animal
{
	void makeSound(){}
}
class Dog extends Animal
{
	void makeSound(){System.out.println("bark bark");}
}
class Cat extends Animal
{
	void makeSound(){System.out.println("meow meow");}
}
class Home
{
	Animal a;
	void hit(){
		a.makeSound();
	}
}