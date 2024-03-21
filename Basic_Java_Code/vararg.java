import java.io.*;
import java.util.*;
import java.lang.*;

class vararg
{
                 static void display (Stirng___values)
                 {
                            System.out.println("display method invoked");
                                    for(String S:values)
                                    {
                                    System.out.println(S);
                                    
                                    }
                 
                }
                   public static void main(String args[])
                  {
                                    display();
                                    display("hello");
                                    diaply("One","Two","Three","Four");
                                    
                  }
                 
}