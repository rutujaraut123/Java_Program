class A
{
	int a,b;
	void add()
	{
		int a=10,b=20;
		int sum;
		sum=a+b;
		System.out.println("Addition:"+sum);
	}
	void sub()
	{
		int a=10,b=20;
		int sub;
		sub=a-b;
		System.out.println("Addition:"+sub);
	}


}
class B extends A
{
	 void mult()
	 {
	 	int a=20,b=50;
	 	int mul;
	 	mul=a*b;
	 	System.out.println("Multiplication:"+mul);
	 }
	 void div()
	 {
	 	int a=40,b=2;
	 	int div;
	  div=a/b;
	 	System.out.println("Division:"+div);
	 }

}
class Multilevel 
{
	public static void main(String[] args) {
		
	B r1=new B();
    r1.add();
    r1.sub();
    r1.mult();
    r1.div();
}
}