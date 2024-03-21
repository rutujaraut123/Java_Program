class Private_Cons
{
	int a,b;
	private  Private_Cons()
	{
   a=10;
   b=21;
   System.out.println(a+" "+b);
	}


	public static void main(String[] args)
	 {
		
     Private_Cons ob1=new Private_Cons();

	}
}