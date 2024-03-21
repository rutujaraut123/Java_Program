import java.io.*;
import java.util.*;
import java.lang.*;

class Maximum

{
                  int num1,num2;
                  Maximum(int n1,int n2)
                  {
                                    num1=n1;
                                    num2=n2;
                  }
                  int largest()
                  {
                                    if(num1>num2)
                                    {
                                                      return (num1);
                                    }
                                    else
                                    {
                                                      return (num2);
                                    }
                  }
                  void dispaly()
                  {
                                 int large=  largest();
                                 System.out.println("Largest Number="+large);
                
                  }
                  
}
class Nesting_test
{
                  public static void main(String []srg)
                  {
                                    
                  
                  Maximum max=new Maximum(90,10);
                  max.dispaly();
                
                  }
}