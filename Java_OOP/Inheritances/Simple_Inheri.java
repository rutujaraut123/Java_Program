
import java.io.*;
import java.util.*;
import java.lang.*;


class A
{
                 public void methodA()
                 {
                  System.out.println("Super class Method Called");
                 } 
}
class Simple_Inheri extends A
{
                  public void methodB()
                  {
                                    System.out.println("Base CLass Method Called");
                                    
                  }
                  public static void main(String ars[])
                  {
                                    Simple_Inheri obj=new Simple_Inheri();
                                    obj.methodA();
                                    obj.methodB();
                  }
}