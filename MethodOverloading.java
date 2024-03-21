class MethodOverloading
{
	void add()
	{
		int a=100,b=200,c;
		c=a+b;
		System.out.println("Addition:"+c);
	}
	void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println("Addition:"+c);
	}
	void add(int x,double y)
	{
		double c;
		c=x+y;
		System.out.println("Addition:"+c);
	}
	public static void main(String[] args) {
		MethodOverloading r=new MethodOverloading();
		r.add();
		r.add(100,200);
		r.add(23,42.5);
	}
}