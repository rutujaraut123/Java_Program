class A

{
	int a,b;
	A()
	{
     a=10;
     b=90;
     System.out.println(a+" "+b);
	}
	A( A ref)
	{
      a=ref.a;
      b=ref.b;

     System.out.println(a+" "+b);
	}

}
class Copy_Cons
{
	public static void main(String[] args) {
		A r=new A();
		A r2=new A(r);
	}
}