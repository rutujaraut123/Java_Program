import java.io.*;
import java.lang.*;
import java.util.*;

class Rectangle
{
                  int length,width,areaR;
                  Rectangle(int x,int y)   //Cnstructor Same Name Of Class
                  {
                                    length=x;
                                    width=y;
                                
                  }
                  int area()
                  {
                                    return (length*width);
                                
                  }
                  
                  public static  void main(String[] args)
                  {
                               Rectangle r1=new Rectangle(10,20); // Passing Lenght and Width ,r1 is object
                                     int areaR=   r1.area();                  // By Object we acess the function area()
                                    System.out.println("Area="+areaR);
                  }
}