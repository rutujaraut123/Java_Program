import java.util.*;
class ConvertTo
{
                  int terabyte,gigabyte,megabyte;
                  Scanner sc=new Scanner(System.in);
                  ConvertTo()
                  {
                                    System.out.println("Enter the tera byte value:");
                                    terabyte=sc.nextInt();
                                     System.out.println("Enter the giga byte value:");
                                    gigabyte=sc.nextInt();
                                     System.out.println("Enter the megabyte value:");
                                    megabyte=sc.nextInt();
                                    
                  }
                  ConvertTo(int gigabyte,int megabyte,int terabyte)
                  {
                                    this.gigabyte=gigabyte;
                                    this.megabyte=megabyte;
                                    this.terabyte=terabyte;
                  }
                  void display()
                  {
                                    System.out.println("Gigabyte:"+gigabyte);
                                    System.out.println("Megabyte:"+megabyte);
                                    System.out.println("Terabyte"+terabyte);
                  }
                  public static void main(String args[])
                  {
                                    ConvertTo c1=new ConvertTo();
                                    c1.display();
                                   int byte_Value=c1.gigabyte*1073741824;
                                   System.out.println("Gigabyte in Byte:"+byte_Value);
                                 int byte_Value1=c1.megabyte*1048576;
                                 System.out.println("Megabyte in Byte value:"+byte_Value1);
                                 double byte_Value2=c1.terabyte* (Math.pow(10,12));
                                 System.out.println("Terabyte in Byte value:"+byte_Value2);
                                 ConvertTo c2=new ConvertTo(3,4,5);
                                 c2.display();
                                 int byte_Value4=c2.gigabyte*1073741824;
                                   System.out.println("Gigabyte in Byte:"+byte_Value4);
                                 int byte_Value5=c2.megabyte*1048576;
                                 System.out.println("Megabyte in Byte value:"+byte_Value5);
                                 double byte_Value6=c2.terabyte*(Math.pow(10,12));
                                 System.out.println("Terabyte in Byte value:"+byte_Value6);
                                 
                                    
                                 
                  }
}