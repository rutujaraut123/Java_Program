
class College_Bag
{
                  int price;
                  String color;
                  String company_name;
                  String quality;
                  int quantity;
                  College_Bag()
                  {
                                    price=12000;
                                    color="Red";
                                    company_name="SkyBag";
                                    
                  }
                  College_Bag(int p,String c,String ch)
                  {
                                    price=p;
                                    color=c;
                                    company_name=ch;
                                    
                  }
                  College_Bag(String qual,int quan)
                  {
                                   quality=qual;
                                   quantity=quan;
                                   
                  }
                  void display()
                  {
                                    System.out.println("Price="+price);
                                    System.out.println("Color="+color);
                                    System.out.println("Comapany Name="+company_name);
                                    System.out.println("Quality of bag"+quality);
                                    System.out.println("Quantity of bags"+quantity);
                  }
                  

                  
}