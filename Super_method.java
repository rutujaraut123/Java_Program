class A
{
	void show()
	{
		System.out.println("I am from Super Class");
	}

}
class B extends A
{
	int a=20;
	
	void show()
	{

		System.out.println("I am from Sub Class");
		super.show();
	}
}
class Super_method
{
	public static void main(String[] args) {
		B r=new B();
		r.show();
	}
}
