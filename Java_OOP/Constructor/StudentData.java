import java.io.*;
import java.lang.*;
import java.util.*;

class Student
{
                  String name;
                  int marks;
                  int rollno;
                  
                  Student(String sname,int smarks,int srollno)
                  {
                       name=sname;
                       marks=smarks;
                       rollno=srollno;             
                  }
                  void input()
                  {
                                   System.out.println("Enter the Student Data");
                  }
                  void display()
                  {
                                    System.out.println("Student name="+name);
                                    System.out.println("Student marks="+marks);
                                    System.out.println("Student rollno="+rollno);

                  }

}
class StudentData
{
                  public static void main(String[] ars)
                  {
                                    Student s1=new Student("Rutuja",100,44);
                                    s1.input();
                                    s1.display();
                  }
}