import java.io.*;
import java.util.*;
import java.lang.*;

class x
{
                  int i;
                void x(int i)
                  {
                                    this.i=i;
                                    System.out.println("Createdc X");
                  }
}
class Y extends x
{
                  int j;
                  void y(int i,int j)
                  {
                                    super(i);
                                    this.j=j;
                                    System.out.println("Created Y");
                  }
}
class z extends Y
{
                  int k;
                void  z(int i,int j,int k)
                  {
                                    super(i,j);
                                    this.k=k;
                                    System.out.println("Created Z");
                  }
                  
}
class Multilevel Constructor
{
                  public static void main (String [] args)
                  {
                                    z z1=new z(10,20,30);
                                    z1.x();
                                    System.out.println("--------");
                  }
}