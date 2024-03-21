 import java.io.*;
 import java.util.*;
 import java.lang.*;
 
 class SwapBitwiseOperator
 {
                  public static void main (String  args[])
                  {
                  
                  int x,y;
                  Scanner r=new Scanner(System.in);
                  System.out.println("Enter First Number:"); //X=5(0101)
                  x=r.nextInt();

                  System.out.println("Enter Second Number:");//y=9(1001)
                  y=r.nextInt();
                  
                  System.out.println("Before Swapping=");
                  System.out.println("x= " +x +", y = " +y);  
                  
                  x=x^y;//0101
                        //1001
                        //1100 =x
                        
                  y=x^y; //1100
                        // 1001
                        // 0101 =y
                  
                  x=x^y; // 1100
                         // 0101
                         // 1001 
               
                  
                   System.out.println("x= " +x +", y = " +y);
                  }
                  
 }