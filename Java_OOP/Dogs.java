abstarct class Animal
{

   //abstarct  method
	public abstract void  makesound();

	void slepp()
	{
		System.out.println("Zzzz...");
	}
}
class Dogs extends Animal
{
	//Implementattion for makesound()
	public void makesound()
	{
		System.out.println("Bhooo..");
	}
	Dog d1=new Dog();
	d1.makesound();
	d1.slepp();
}