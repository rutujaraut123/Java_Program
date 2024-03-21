import java.io.*;
import java.lang.*;
import java.util.*;

public class LeapYear
{
                  public static void main(String args[])
                  {
                                    int Year;
                                    Scanner r=new Scanner(System.in);
                                    
                                    System.out.println("Enter ANyYear To Check=");
                                    Year=r.nextInt();
                                    
                                    if(Year%4==0)
                                    {
                                                      System.out.println("Year is Leap");
                                    }
                                    else
                                    {
                                                      System.out.println("Year is Not Leap");
                                    }
                  }
}