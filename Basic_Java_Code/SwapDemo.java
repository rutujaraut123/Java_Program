import java.awt.*;
import java.awt.event.*;

public class SwapDemo extends Frame implements ActionListener
{
  public SwapDemo()
  {
   setSize(300,400);
   setVisible(true);
   setLayout(null);

   Label l1= new Label();
   l1.setText("Hello");
   l1.setBounds(100,100,50,30);
   l1.addactionListener(this);
    this.add(l1);
 
   Label l2= new Label();
   l1.setText("Hello");
   l1.setBounds(100,100,50,30);
   l1.addactionListener(this);
  this.add(l2);
  
   
   Button b1=new Button();
   b1.setText("Swap");
   b1.setBounds(50,100,150,30);
   b1.addactionListener(this);
   this.add(b1);
 
   //Window Closing Code
  this.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent we)
     {
      System.exit(0);
     }
    });
  }
  //ActionPerformed
  
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getsource()==l1)
    {
     l1.setText("Welcome");
    } 
  }
  //Frame Size,Lable
  public static void main(String args[])
  {
   SwapDemo oB=new SwapDemo();
   oB.setTitle("Swaping Lable");
   oB.setSize(500,300);
   oB.setVisible(true);


  }
}