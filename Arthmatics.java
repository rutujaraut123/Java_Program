import java.util.*;
class Add{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}

class Sub
{
   int sub(int a,int b)
   {
     int subs=a-b;
     return subs;
   }
}

class Mul
{
	int mul(int a,int b)
	{
     int mult=a*b;
     return mult;
    }
}

// class Div
// {
//    int div(int a,int b)
//    {	
//     int sum=a/b;
//    }
// }
public class Arthmatics
{
  public static void main(String[]args)
  {
  	Add a1=new Add();
  	Sub a2=new Sub();
  	Mul a3=new Mul();
  	Scanner sc=new Scanner(System.in);
  	System.out.println("ENter the Number");
  	int x=sc.nextInt();
  	int y=sc.nextInt();
  	int sum=a1.add(x,y);
  	int subs=a2.sub(x,y);
  	int mult=a3.mul(x,y);
     System.out.println("Sum of Input number is:"+sum);
      System.out.println("Substraction of Input number is:"+subs);
      System.out.println("Multiplication of Input number is:"+mult);



  }
}