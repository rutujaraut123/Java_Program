import java.io.*;
import java.util.*;
import java.lang.*;

     class MethodOverloading
     {
 
          int add(int a,int b)
          {
             return(a+b);
                  
          }
          int add(int a,int b,int c)
          {
             return(a+b+c);
                  
          }
          float add(float x,float y)
          {
             return(x+y);
                  
          }
     }
     class FunctionOverloading
     {
     
          public static  void main(String args[])
          {
                  MethodOverloading of=new MethodOverloading();
                  
                  System.out.println("Addition of Two Number="+of.add(2,5));
                  System.out.println("Addition of Three Number="+of.add(2,5,6));
                  System.out.println("Addition of Floating Number="+of.add(2.6f,5.5f));
          }
		
     }