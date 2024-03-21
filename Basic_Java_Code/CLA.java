import java.io.*;
import java.util.*;
import java.lang.*;
class CLA
{
                  public static void main(String args[])
                  {
                                    if(args.length>0)
                                    {
                                                      System.out.println("Command line arguments=");
                                                      for (String val:args)
                                                      {
                                                                        System.out.println(val);
                                                      }
                                                      
                                    }
                                    else{
                                                      System.out.println("No Command line argument");
                                    }
                                    
                  }
}