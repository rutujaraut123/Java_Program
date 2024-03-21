import java.io.*;
import java.util.*;

class Employee
{
                  String emp_name;
                  int emp_id;
                  
                  public void getdata()
                  {
                                    Scanner r=new Scanner(System.in);
                                    System.out.println("Enter Employee Name:");
                                    r.emp_name=next();
                                     
                                    System.out.println("Enter Employee ID:");
                                    r.emp_id=nextInt();
                                    
                  }
                 public void putdata()
                  {
                                    System.out.println("Name="+emp_name);
                                    System.out.println("Name="+emp_id);               
                   }
                  
}
class worker extends Employee
{
                  int overtime_salary;
                  public void getw()
                  {
                                    Scanner s=new Scanner(System.in);
                                    System.out.println("Enter worker overtime salary:");
                                    s.overtime_salary=nextInt();
                  }
                public  void outw()
                  {
                                    System.out.println("Overtime salary="+overtime_salary);
                  }
                  
                  
}
class Manager extends Employee
{
                  int additional_allow;
                 public void getm()
                  {
                                    Scanner m=new Scanner(System.in);
                                    System.out.println("Enter manager additional allowment:");
                                    m.additional_allow=nextInt();          
                  }
                  public void outm()
                  {
                                    System.out.println("Additional Allowment="+additional_allow);
                  }
                
}
class Heirarcical
{
                    public static void main(String[]args)
                  {
                                    worker w=new worker();
                                    w.getw();
                                    w.outw();
                                    
                                    
                  }
}