import java.io.*;
import java.util.*;
import java.lang.*;

class Person
{
                  String name;
                  int age;
                   void  input()
                   {
                                    Scanner r=new Scanner(System.in);
                               //     System.out.println("Enter the Person Name=");
                                   // name=r.nextString();
                                    System.out.println("Enter the Person Age=");
                                    age=r.nextInt();
                                                                   
                   }
                   void output()
                   {
                                    //System.out.println("Name="+name);
                                    System.out.println("Age="+age);
                   }
               
                  
}
class Employee extends Person
{
                  int emp_id;
                  int emp_sala;
                   void  getdata()
                   {
                                    Scanner r=new Scanner(System.in);
                                    System.out.println("Enter the Employee Id=");
                                    emp_id=r.nextInt();
                                    System.out.println("Enter the Employee Salary=");
                                    emp_sala=r.nextInt();
                                                                   
                   }
                   void putdata()
                   {
                                    System.out.println("Emp_Id="+emp_id);
                                    System.out.println("Emp_Salary="+emp_sala);
                   }
                
}
class Programer extends Employee
{
                  int no_Of_Programer;
                  void input1()
                  {
                                    Scanner r=new Scanner(System.in);
                                    System.out.println("Enter the No Of Programer=");
                                    no_Of_Programer=r.nextInt();
                  }
                  void output1()
                  {
                           System.out.println("No Of Programer="+no_Of_Programer);         
                  }
                      public static void main(String args[])
                   {
                                    Programer p1=new Programer();
                                    p1.input();
                                    p1.getdata();
                                    p1.input1();
                                    
                                    p1.output();
                                    p1.putdata();
                                    p1.output1();
                   }
                  
}