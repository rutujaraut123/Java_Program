class Sum_Digit
{
	public static void main(String []args)
	{
	    int n=123;
   int sum=0;
   while(n>0)
   {
   	 sum+=n%10; //Sum=123%10=3
   	 n=n/10; //n=12
   }
    System.out.println("Sum of Digit"+sum);
	}
}