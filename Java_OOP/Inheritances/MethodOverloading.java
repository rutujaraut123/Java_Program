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
          int add(float x,int y)
          {
             return(x+y);
                  
          }
     }
     class FunctionOverloading
     {
     
          public static  void main(String args[])
          {
                  MethodOverloading of=new FunctionOverloading();
                  
                  System.out.println("Addition of Two Number="+of.add(2,5));
          }
		
     }