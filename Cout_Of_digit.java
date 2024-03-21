class Count_Of_Digit
{
	public static void main(String[]args)
	{
	   int n=267381;
   int numofDigit=0;
    while(n>0)
    {
	   n=n/10;
	   numofDigit++;
    }
    System.out.println("Number of Digit"+numofDigit);
}
}