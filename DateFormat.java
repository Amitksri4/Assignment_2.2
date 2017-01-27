
package assignment2_2;
  import java.io.*;

public class DateFormat {
    
  public static void main(String args[])throws IOException
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l, y, d, m;
        String dd, mm, yy;
 
        //array storing the maximum days of every month
        int maxdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
 
        //array storing the month names
        String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
                         "September", "October", "November", "December" };
 
        System.out.print("Enter any date in 8 digits (date month year) format: ");
        String date = br.readLine(); 
 
        l = date.length(); 
 
        if(l==10) 
        {
            dd = date.substring(0,2); 
            mm = date.substring(3,5); 
            yy = date.substring(6); 
            d = Integer.parseInt(dd);
            m = Integer.parseInt(mm);
            y = Integer.parseInt(yy);
 
            if((y%400==0) || ((y%100!=0)&&(y%4==0))) 
            {
                maxdays[2]=29;
            }
             
                        if(m<0 || m>12 || d<0 || d>maxdays[m] || y<0 || y>9999) 
            {
            System.out.println("The day, month or year are outside acceptable limit");
            }
 
            else
            {
                
                System.out.println("Date in yyyy/MM/DD format = "+yy+"/"+mm+"/"+dd);
                              
                
              }
        }
 
        else
            System.out.println("Wrong Input");
    }
}
    

