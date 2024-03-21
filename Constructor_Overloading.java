class A
{
	int  a ,b,c;
	A()
	{
       a=100;
	}
	A(int x,int y)
	{
       a=x;
       b=y;
	}
	A(int y,int z,int w)
	{
       a=x;
       b=z;
       c=w;
	}
}
clas Constructor_Overloading
{
	public static void main(String[] args) {
		
	
	A r1=new A();
	A r2=new A( 233,122);
    A r3=new A(100,200,300);
    System.out.println(r1.a);
    System.out.println(r2.a+" "+r2.b);
}
}