//Question2.2.1). Given the berth number in a 3-tier AC compartment, 
//write a program to output whether it is a lower berth, upper berth, side lower berth, side upper berth.

package assignment2_2;
import java.util.Scanner;
public class BerthConfirmation {
    public static void main(String[] args) {
        
       int bno;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the berth number in 3-tier AC Compartment :");
        bno=sc.nextInt();
        BerthConfirmationCalculation bc=new BerthConfirmationCalculation();
        bc.display(bno);
    }
}
