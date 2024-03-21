class Test
{
                  int math_marks,english_marks,physics_marks;
                  Test()
                  {
                          math_marks=98;
                          english_marks=56;
                          physics_marks=89;          
                                    
                  }
                  Test(int math_marks,int english_marks,int physics_marks)
                  {
                                    this.math_marks=math_marks;
                                    this.english_marks=english_marks;
                                    this.physics_marks=physics_marks;
                  }
                  void output()
                  {
                     System.out.println("Math="+math_marks);
                     System.out.println("English="+english_marks);
                     System.out.println("Physics:"+physics_marks);               
                  }
                  public static void main(String srgs[])

                  {
                                    Test t1=new Test();
                                    System.out.println("First Test:");
                                    t1.output();
                                    Test t2=new Test();
                                    System.out.println("Second Test:");
                                    t2.output();
                                    int average_of_test1=(t1.math_marks+t1.english_marks+t1.physics_marks)/3;
                                    System.out.println("Average Of First test="+average_of_test1);
                                     int average_of_test2=(t2.math_marks+t2.english_marks+t2.physics_marks)/3;
                                    System.out.println("Average Of Second test="+average_of_test2);
                  }
                                                      
}