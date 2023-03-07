class Test7 
{
	public static void main(String[] args) 
	{
		Human d=new Human();
		d.eating();
		d.sleeping();
	}
}
class Animal
{
	public void eating(){
		System.out.println("Animal eats food");
	}
	public void sleeping(){
		System.out.println("sleeping...");
	}
}
class Human extends Animal
{
	public void eating(){
		System.out.println("Human eats food.");
		System.out.println("Human loves to eat chicken");
	}
}
class Dog extends Animal
{
}