class Addition
{
                  int a=10,b=20,c;
                  Addition()
                  {
                                    System.out.println("Default Additon ");
                  }
                  void calculate()
                  {
                                   
                                    c=a+b;
                                    System.out.println(c);
                  }
                  
}
class Calculation extends Addition
{
                  Calculation()
                  {
                                    System.out.println("Calculation class");
                  }
                  void show()
                  {
                                    //this.show();
                               ////     a=20;
                               //     b=60;
                                    c=a*b;
                                    System.out.println(c);
                  }
                public static void main (String[] args) 
                  {
                                    Calculation c=new Calculation();
                                    c.show();
                                    c.calculate();
                   }
}