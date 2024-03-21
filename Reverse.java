class Reverse
{
	public static void main(String[]args)
	{
		int num=37844;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;

			//rev=0*10+37844%10;
			//rev=4;
			num=num/10;
			num=37844/10;
			//num=3784
			//2)rev=4*10+3784%10;
			//rev=40+4=44
			//num=37
		}
	}
}