import java.io.*;
import java.util.*;
import java.lang.*;

class A//super class
 {
                  
                  void add()
	{
                      int Num1,Num2,add;
                   
                  Scanner r=new Scanner(System.in);
                  System.out.println("Enter First Number:");
                  Num1=r.nextInt();

                  System.out.println("Enter Second Number:");
                  Num2=r.nextInt();
	add=Num1+Num2;
	System.out.println("Addtion="+add);	 
	}

	void sub()
	{
                   int Num3,Num4,subs;
                   
                  Scanner r=new Scanner(System.in);
                  System.out.println("Enter First Number:");
                  Num3=r.nextInt();

                  System.out.println("Enter Second Number:");
                  Num4=r.nextInt();
                  subs=Num3-Num4;
                  System.out.println("Substraction="+subs);
                  

                   	 
	}
}
class B extends A
{
	void mul()
	{
                                   int Num5,Num6,multi;
                   
                  Scanner r=new Scanner(System.in);
                  System.out.println("Enter First Number:");
                  Num5=r.nextInt();

                  System.out.println("Enter Second Number:");
                  Num6=r.nextInt();
                  multi=Num5*Num6;
                  System.out.println("Multiplication="+multi);
	 
                   	 
	}

	void div()
	{
	 
                     int Num7,Num8,divi;
                   
                  Scanner r=new Scanner(System.in);
                  System.out.println("Enter First Number:");
                  Num7=r.nextInt();

                  System.out.println("Enter Second Number:");
                  Num8=r.nextInt();
                  divi=Num7/Num8;
                  System.out.println("Division="+divi);
                   

              	 
	}
}
class C extends B
{
	void Rem()
	{
                    int Num9,Num10,rem;
                   
                  Scanner r=new Scanner(System.in);
                  System.out.println("Enter First Number:");
                  Num9=r.nextInt();

                  System.out.println("Enter Second Number:");
                  Num10=r.nextInt();
                  rem=Num9%Num10;
                  System.out.println("Reminder="+rem);
               	 
	}
}
class Multilevel
{
	public static void main (String args[])
	{
	C t=new C();
	t.add();
	t.sub();
	t.mul();
	t.div();
	t.Rem();
	}
}
	
   	