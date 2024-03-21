import java.util.*;
class Printer_20
{
                  String type;
                  int speed,cost;
                  Scanner sc=new Scanner(System.in);
                  Printer_20(String type,int speed,int cost)
                  {
                                    System.out.println("Enter the type of printer:");
                                    type=sc.next();
                                    System.out.println("Enter speed of Printer:");
                                    speed=sc.nextInt();
                                    System.out.println("Enter cost of Printer:");
                                    cost=sc.nextInt();
                  }
                  Printer_20()
                  {
                                    type="Leaser Printer";
                                    speed=20;
                                    cost=23000;
                  }
                  void display()
                  {
                                    System.out.println("Type of printer:"+type);
                                    System.out.println("Speed Of Printer:"+speed+" pages per minutes");
                                    System.out.println("Cost Of Printer:"+cost);
                  }
                  public static void main(String args[])
                  {
                                    Printer_20 p2=new Printer_20("LED Printer",45,800000);
                                    p2.display();
                                    Printer_20 p1=new Printer_20();
                                    p1.display();
                                    if(p1.cost>p2.cost)
                                    {
                                                      System.out.println(p1.type+"expensive");
                                                      
                                    }
                                    else{
                                                      System.out.println(p2.type+"expensive");
                                    }
                                    
                  }
}