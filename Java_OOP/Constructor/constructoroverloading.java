import java.io.*;
import java.util.*;
import java.lang.*;

class Room
{
                  int length,breadth,height;
                  Room(int l,int b,int h)  //constructor 
                  {
                                    length=l;
                                    breadth=b;
                                    height=h;
                  }
                  Room(int len)  // Constructor with differnt argument
                  {
                                    length=breadth=height=len ; // This shows that len is equal to breadth and height
                  }
                  int volume()
                  {
                                    return length*breadth*height;
                  }
}
class constructoroverloading
{
                  public static void main(String[]args)
                  {
                                    Room a=new Room(10,20,30);
                                    Room b=new Room(10);
                                    int vol;
                                    vol=a.volume();
                                    System.out.println("First Room Volume"+vol);
                                    vol=b.volume();
                                    System.out.println("Second Room Volume"+vol);
                                    
                                                      
                  }
}