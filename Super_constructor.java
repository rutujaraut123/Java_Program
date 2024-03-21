class A
{
	A()
	{
		System.out.println("I am Super Constructor");
	}

}
class B extends A
{
	int a=20;
	
	B()
	{

		System.out.println("I am  Sub Constructor");
	
	}
}
class Super_constructor
{
	public static void main(String[] args) {
		B r=new B();
		
	}
}
