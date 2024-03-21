class Passing_Object
{
                  int a,b,i;
                   public  static void swap(Passing_Object obj)
                  {
                                    int temp;
                                    temp=obj.a;
                                    obj.a=obj.b;
                                    obj.b=temp;
                  }
                  public static void main(String args[])
                  {
                                    Passing_Object ob=new Passing_Object();
                                    ob.a=10;
                                    ob.b=20;
                                    System.out.println("Before Swap:");
                                    System.out.println(ob.a+""+ob.b);
                                    swap(ob);
                                    System.out.println("After Swap");
                                    System.out.println(ob.a+" "+ob.b);
                  }
                                    
                  
}