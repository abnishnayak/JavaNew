class Test3 
{
	public static void main(String[] args) 
	{
		Animal a=new Labrador();
		System.out.println(a instanceof Labrador);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Object);
		System.out.println(a instanceof Cat);
	}
}
class Animal
{
}
class Dog extends Animal
{
}
class Labrador extends Dog
{
}
class Cat extends Animal
{
}