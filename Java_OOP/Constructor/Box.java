class Box
{
                  int length,breadth,heigth;
                  Box()
                  {
                                    System.out.println("Details Of Box");
                  }
                  Box(int length,int breadth)
                  {
                                    this();
                                   this. length=length;
                                    this.breadth=breadth;
                  }
                  Box ()
                  {
                                    
                                   length=10;
                                    breadth=23;
                                    heigth=90;
                                    
                  }
                  void display()
                  {
                                    System.out.println("Length="+length);
                                    System.out.println("breadth="+breadth);
                                    System.out.println("Heigth"+heigth);
                  }
}