class TestDepartment
{
                 public static void main(String args[])
                 {
                  Department d1=new Department();
                  d1.display();
                  Department d2=new Department("ENTC","Prof Karande SIr",780,97);
                  d2.display();
                  if((d1.per_of_result/d1.total_students)>(d2.per_of_result/d2.total_students))
                  {
                                    System.out.println("CSE Department Result is worst");
                                    d1.display();
                  }
                  else
                  {
                                    System.out.println(" ENTC Department Result is worst");
                                  d2.display();
                  }
                 }
}