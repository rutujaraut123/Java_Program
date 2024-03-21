import java.io.*;

class Student
 {
 	//Data is private and it is not acessable to anyone
	 private int roll_no;
     private String sname;

     //by using setter method we set values 
     public void setRollNo(int r)
     {
       roll_no=r;
     }
     public void setSname(String s)
     {
       sname=s;
     }

     //By using getter method we fetch the values
  public String getSname()
  {
  	return sname;
  }
  public int getRollno()
  {
  	return roll_no;
  }

}


public class Encapsulation
{
	public static void main(String args[])
	{
		Student s1= new Student();
		s1.setRollNo(5);
		s1.setSname("Navin");

		System.out.println(s1.getSname());
	}
}