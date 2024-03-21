import java.io.*;
import java.util.*;
import java.lang.*;

class Bike
{
                  int speed=50;
                 
}
class Super extends  Bike
{
                  int speed=100;
                   void Display()
                  {
                                    System.out.println("Speed of Bike="+super.speed);
                  }
}
class SuperKeyword 
{
                  public static void main(String args[])
                  {
                  
                  Super s=new Super();
                  s.Display();
                  }
}