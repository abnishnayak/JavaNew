class Test2 
{
	public static void main(String[] args) 
	{
		Animal a=new Labrador();
		Dog d=(Dog) a;
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