import java.io.*;
import java.lang.*;
import java.util.*;

public class LinearSearch
{
                  public static void main(String []args)
                  {
                                    int array[]={19,20,30,40,50};
                                    int value=50;
                                    int  size=array.length;
                                    
                                    for(int i=0;i<size;i++)
                                    {
                                                      if(array[i]==value)
                                                      {
                                                                        System.out.println("Element Found"+i);
                                                      }
                                                      else
                                                      {
                                                                        System.out.println("Element Not Found");
                                                      }
                                                                   
                                    }
                  }
}