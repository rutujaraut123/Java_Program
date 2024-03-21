import java.io.*;
import java.lang.*;
import java.util.*;

class Circle
{
                 double radius;
                 Circle(double r)
                 {
                   radius=r;
                 }
                 double  area()
                 {
                  return (3.14*radius*radius);
                 }
}
                 class CircleArea
                 {
                                    public static void main (String[] args) 
                                    {
                                    Circle c1=new Circle(20);
                                    double areaC=c1.area();
                                    System.out.println("Area Of Circle="+areaC);
                                    }
                 }
                 
