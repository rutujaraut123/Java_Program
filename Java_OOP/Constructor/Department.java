//Define a class ‘Department’ having data members: name_of_hod, 
// total_students and per_of_result. Define overloaded constructors to initialize 
//and method to display the values of these data members. Input values for 
//two objects and determine whose average result per student is worse.

class Department
{
                  String name_of_hod,dep_name;
                  int total_students;
                  double per_of_result;
                  Department()
                  {
                                    dep_name="CSE Department ";
                                    name_of_hod="Prof.Pingale Sir";
                                    total_students=340;
                                    per_of_result=98.56;
                  }
                 
                  Department(String dep_name,String name_of_hod,int total_students,double per_of_result)
                  {
                                    this.dep_name=dep_name;
                                   this. name_of_hod=name_of_hod;
                                    this.total_students=total_students;
                                    this.per_of_result=per_of_result;
                  }
                   void display()
                  {
                                     System.out.println("Name of deaprtment="+dep_name);
                                    System.out.println("Name of HOD="+name_of_hod);
                                    System.out.println("No of total students="+total_students);
                                    System.out.println("Percentage Of Result="+per_of_result);
                  }
                  
}
