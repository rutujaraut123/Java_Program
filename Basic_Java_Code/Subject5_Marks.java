import java.util.Scanner;
class Subject5_Marks
{
 public static void main(String[]args)
 {
  int Sub1,Sub2,Sub3,Sub4,Sub5,Total,Avrage,Percentage; 
 System.out.println("Enter the Marks Of Five Subject:-");
 Scanner r=new Scanner(System.in);
 Sub1=r.nextInt();
 Sub2=r.nextInt();
 Sub3=r.nextInt();
 Sub4=r.nextInt();
 Sub5=r.nextInt();

 Total=Sub1+Sub2+Sub3+Sub4+Sub5;
 Avrage=Total/5;
 Percentage=(Total/200)*100;
 System.out.println("Total Marks Of Five Subject="+Total);
 System.out.println("Avrage Marks Of Five Subject="+Avrage);
 System.out.println("Percentage Marks Of Five Subject="+Percentage);
 }
}