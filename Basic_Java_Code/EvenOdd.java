import java.io.*;
import java.lang.*;
import java.util.*;

public class EvenOdd
{
                  public static void main(String[] args)
                  {
                                    int num;
                                    Scanner r =new Scanner(System.in);
                                    System.out.println("Enetrr Any Number");
                                                      num=r.nextInt();
                                                      
                                                      if(num%2==0)
                                                      {
                                                                        System.out.println("Number is Even");
                                                                        
                                                      }
                                                      else{
                                                                        System.out.println("Number is Odd");
                                                      }
                  }
}