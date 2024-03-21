
import java.util.*;
class Add{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}
public class Algebra
{
	public static void main(String[]args)
	{
      Add a1=new Add();
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int sum=a1.add(x,y);
      System.out.println("Sum of Input number is:"+sum);

	}
}