abstract class Animal
{

   //abstarct  method
	public abstract void  makesound();

	void sleep()
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
	
}
public class Main{
	public static void main(String[] args) {
		Animal d1=new Dogs();
	
	d1.sleep();
	d1.makesound();
	}
}