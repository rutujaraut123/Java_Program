import java.io.*;
import java.util.*;
import java.lang.*;

class Area//super class
{
                  void Area1()
                  {
                  
                  double height=10,width=20,area3;
                  area3=height*width;
                  System.out.println("Area Of Triangle="+area3);
                  }
  
                 
}
class Circle extends Area//Sub class 1
{
                   void Area2()
                  {
                  double radius,arae1;
                  Scanner r=new Scanner(System.in);
                  System.out.println("Enter Radius of Circle:");
                  radius=r.nextInt();
                  
                  System.out.println("Radius of Circle="+radius);
                  arae1=(3.14*radius*radius);
                  System.out.println("Area Of Circle="+arae1);
                  }
                  
}
class Rectangle extends Area //Sub class 2
{
                  void Area3()
                  {
                  float length,bredth,area2;
                  Scanner r=new Scanner(System.in);
                  
                  System.out.println("Enter Length of Rectangle:");
                  length=r.nextInt();
                  
                  System.out.println("Enter breadth of Rectangle:");
                  bredth=r.nextInt();
  
                  System.out.println("Length of Rectangle="+length);
                  System.out.println("Length of Rectangle="+bredth);
                  
                  area2=length*bredth;
                  System.out.println("Area Of Circle="+area2);
                  }
                  
}
class Herarchical
{
                  public static void main(String args[])
                  {
                  
                   Circle c=new  Circle();
                   Rectangle r=new Rectangle();
                   
                   c.Area2();
                   r.Area3();
                   r.Area1();
                   
                  }
                  
}

                  