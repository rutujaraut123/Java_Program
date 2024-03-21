import java.io.*;
class Person
{
                  int ID;
                  String strName;
                  String dob;
                  String address;
                  void getData(int a,String n,String d,String add)
                  {
                                    ID=a;
                                    strName=n;
                                    dob=d;
                                    address=add;
                  }
                  void putData()
                  {
                                    System.out.println("ID="+ID);
                                    System.out.println("Name:"+strName);
                                    System.out.println("Date of Birth:"+dob);
                                    System.out.println("Address:"+address);
                  }
}
interface  Department
{
                  void getDepartment(String d);
}
interface  Role
{
                  void getPosition(String p);
}
class Employee extends Person implements Department,Role
{
                  String strDept,strPos;
                  
                  public void getDepartment(String d)
                  {
                                    strDept=d;
                  }
                  public void getPosition(String p)
                  {
                                    strPos=p;
                  }
                  void display()
                  {
                                    putData();
                                    System.out.println("Department:"+strDept);
                                    System.out.println("Position:"+strPos);
                  }
                  public static void main(String args[])
                  {
                                    Employee oE=new Employee();
                                    oE.getData(101,"Muskan","18-12-2002","Velapur");
                                    oE.getDepartment("Develpment");
                                    oE.getPosition("Manager");
                                    System.out.println("Employee Data:------");
                                    oE.display();
                  }
                  
}
                  
