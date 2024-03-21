
import java.io.*;
import java.util.*;

class car 
{
  public car()   //Class Car Constructor
  {
                  System.out.println("Class Car");
                  
  }               
                  public void vehicle_Type()
                  {
                                    System.out.println("Vehicle Tyepe: Car");
                  } 
}
class Maruti extends car
{
                  public Maruti() //Class MAruti Construvtor
                  {
                                    System.out.println("Classs Maruti");
                  }
                  public void brand()
                  {
                                    System.out.println("Car Brand Is MAruti");
                  }
                  public void speed()
                  {
                                    System.out.println("Speed Is Max 90Km/h");
                  }
}
class Maruti800 extends Maruti
{
                  public Maruti800() // CLass MAruti800 Constructor
                  {
                                    System.out.println("Maruti Model is Maruti8000");
                  }
                  public void speed()
                  {
                                    System.out.println("Max :80Km/H");
                  }
                  public static void main (String [] args)
                  {
                                    Maruti800 m1=new Maruti800();
                                    m1.vehicle_Type();
                                    m1.brand();
                                    m1.speed();
                  }
}