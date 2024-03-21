class Air
{
                  double per_of_oxygen, per_of_nitrogen, humidity;
                 Air()
                 {
                  per_of_oxygen=78;
                  per_of_nitrogen=87;
                  humidity=56;
                 }
                 Air(double  per_of_oxygen,double per_of_nitrogen,double humidity)
                 {
                  this();
                  this.per_of_oxygen=per_of_oxygen;
                  this.per_of_nitrogen=per_of_nitrogen;
                  this.humidity=humidity;
                 }
                 void display()
                 {
                   System.out.println("Percentage of  oxygen="+per_of_oxygen);
                   System.out.println("Percentage of  nitrogen="+per_of_nitrogen);
                   System.out.println("Humidity ="+humidity);
                   
                 }
                 
                  
}