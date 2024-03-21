import java.util.*;
class Printer
{
                  String type;
                  int speed,price;
                  Scanner sc=new Scanner (System.in);
                  Printer()
                  {
                                   System.out.println("Enter The Type :");
                                   type=sc.next();
                                   System.out.println("Enter The Speed:");
                                   speed=sc.nextInt();
                                   System.out.println("Enter The Cost :");
                                   price=sc.nextInt();
                                    
                  }
                  Printer(String type,int speed,int price)
                  {
                                    this.type=type;
                                    this.speed=speed;
                                    this.price=price;
                  }
                  void display()
                  {
                      System.out.println("Type:"+type);
                      System.out.println("Speed"+speed+"Pages Per Minute");
                      System.out.println("Price"+price);              
                  }
                  public static void main(String args[])
                  {
                                    Printer p1=new Printer();
                                    System.out.println();
                                    p1.display();
                                    Printer p2=new Printer(" Laser",50,8700);
                                    p2.display();
                                    if (p1.price>p2.price)
                                    {
                                                      System.out.println(p1.type+" type printer are expensive");
                                    }
                                    else{
                                                      System.out.println(p2.type+" type printer are expensive");
                                    }
                  }
}