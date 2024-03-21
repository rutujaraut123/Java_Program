class A
{

 void input()
 {
 	System.out.println("Enter the Name:");
 }
}
class B extends A
{
 void show()
 {
 	System.out.println("My Name is rutuja");
 }
}
class C extends A
{
	void disp(){
 System.out.println("My sirname is Raut");
}
}
class Herachical
{
	public static void main(String[] args) {
		
	
	B r1=new B();
	r1.input();
	r1.show();
	C r2=new C();
	r2.input();
	r2.disp();
}
}