import java.io.*;
import java.util.*;
import java.lang.*;

class Student//super class
 {
   	int roll;
   	String name;
	int marks;
   	void input()
   	 {
          System.out.println("Enter Roll No,Name and maks");
	}
}

class ankit extends Student//Sub class
{
	void disp()
	{
	roll=10;
	name="Ankit";
	marks=400;
	System.out.println("Roll NO="+roll);
	System.out.println("Name="+name);  
	System.out.println("Marks="+marks);
	}
}
class Single
{
	public static void main (String args[])
	{
	ankit a=new ankit();//object created of sub class
	a.input();//method accessed of superclass by sub class
	a.disp();
	}
}
 