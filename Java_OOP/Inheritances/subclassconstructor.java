import java.io.*;
import  java.lang.*;
import java.util.*;

class Vehicle
{
                  Vehicle()  //PArent Class Constructor
                  {
                                    System.out.println("Vehicle Is Created");
                  }
                  
}
class Bike extends Vehicle
{
                  Bike()   //Child Class Construcor
                  {
                                    super();  //Wihtout calling method of parent class by object we casll it by super
                                    System.out.println("Bike is Created");
                  }
                  public static void main(String args[])
                  {
                                    Bike b1=new Bike();  //Object Created of Child class constructor
                                    
                  }
}