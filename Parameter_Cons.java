class A
{
	int x,y;
	 A(int a,int b)
	 {
       x=a; 
       y=b;
	 }
	 void show()
	 {
    System.out.println(x);

	 }
    }

class Parameter_Cons
{
	public static void main(String[] args) {
		A r=new A(100,200);
		r.show();
	}
}