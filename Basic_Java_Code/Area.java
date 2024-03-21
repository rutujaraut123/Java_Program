import java.io.*;
import java.lang.*;
import java.util.*;

public class Area
{
                  public static void main(String args[])
                  {
                                   int len,breadth,AreaR;
                                   double radius,AreaC;
                                   
                                   Scanner r=new Scanner (System.in);
                                   
                                   System.out.println("Enter Length=");
                                   len=r.nextInt();
                                    
                                   System.out.println("ENter Breadth");
                                   breadth=r.nextInt();
                                   
                                   System.out.println("Enter Radius");
                                   radius=r.nextDouble();
                                   
                                   AreaR=len*breadth;
                                   AreaC=3.14*radius*radius;
                                   
                                   System.out.println("Area Of Rectangle="+AreaR);
                                   System.out.println("Area OfCircle="+AreaC);
                  }
}