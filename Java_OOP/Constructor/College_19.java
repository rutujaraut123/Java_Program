import java.util.*;
class College_19
{
                  int total_students,per_of_result;
                  String branch;
                  College_19()
                  {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter total students:");
                        total_students=sc.nextInt();
                        System.out.println("Enter branch:");
                        branch=sc.next();
                        System.out.println("Enter percentage of result:");
                        per_of_result=sc.nextInt();            
                  }
                  College_19(int total_students,String branch,int per_of_result)
                  {
                                    this.total_students=total_students;
                                    this.branch=branch;
                                    this.per_of_result=per_of_result;
                  }
                  void display()
                  {
                                    System.out.println("Total Students:"+total_students);
                                    System.out.println("Branch:"+branch);
                                    System.out.println("Percentage Of result:"+per_of_result);
                  }
                  public static void main(String  args[])
                  {
                                    College_19 c1=new College_19();
                                    System.out.println("Information for CSE :");
                                    c1.display();
                                    College_19  c2=new College_19(350,"Mechanical",78);
                                    System.out.println("Information of Mechanical Department");
                                   c2.display();
                                   if(c1.per_of_result>c2.per_of_result)
                                   {
                                    System.out.println(c1.branch+"Result is better");
                                   }
                                   else
                                   {
                                    System.out.println(c2.branch+"Result Is Better");
                                   }
                                    
                 }
}