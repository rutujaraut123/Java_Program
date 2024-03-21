class College
{
                  int total_student,per_of_result;
                  String branch;
                 College()
                 {
                  total_student=120;
                  branch="CSE";
                  per_of_result=98;
                  
                }
                College(int total_student,String branch,int per_of_result)
                {
                 this. total_student=total_student;
                 this.branch=branch;
                 this.per_of_result=per_of_result;
                  
                }
                 void display()
                 {
                  System.out.println("Total_Student:"+total_student);
                  System.out.println("Branch:"+branch);
                  System.out.println("Percentage Of Result:"+per_of_result);
                 }
                 public static void main(String args[])
                 {
                  College c1=new College();
                  System.out.println("First Object Data");
                  c1.display();
                  College c2=new College(670,"ENTC",78);
                  System.out.println("Second Object data");
                  c2.display();
                  if(c1.per_of_result>c2.per_of_result)
                  {
                                    System.out.println(c2.branch+" Result is Worst");
                  }
                  else{
                                    System.out.println(c1.branch+" Result Is Worst");
                  }
                 }
}