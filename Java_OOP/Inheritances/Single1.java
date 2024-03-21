import java.io.*;
import java.util.*;
import java.lang.*;

class Employes//super class
 {
	String Ename;
   	int eid;
 	int esalary;
  	void getinput()
	{
	System.out.println("Enter the employee name ,idand salary");
	}
}
class Employee1 extends Employes
{	
	void getoutput()
       {
	Ename="Bhausaheb";
	eid=24;
	esalary=10000;
       
	System.out.println("Employee Name="+Ename);
 	System.out.println("Employee ID="+eid);
	System.out.println("Employee Salary="+esalary);
	}
}
class Single1
{
	public static void main (String[] ags)
	{
	Employee1 e= new Employee1();
	e.getinput();
	e.getoutput();
	}
}	