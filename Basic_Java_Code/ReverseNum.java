import java.io.*;
import java.lang.*;
import java.util.*;

public class ReverseNum
{
                  public static void main(String args[])
                  {
                                    int rev=0,num;
                                    Scanner r=new Scanner (System.in);
                                    
                                    System.out.println("Enter Any Number");
                                    num=r.nextInt();
                                    
                                    while(num!=0)
                                    {
                                                    int  rem=num%10;
                                                      rev=rev*10+rem;
                                                      num=num/10;
                                    }
                                    System.out.println("Reverse Number="+rev);
                  }
}