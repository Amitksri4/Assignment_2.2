//Question 2.2.2) Given input: “1,2,3,4,5-8,6-10,8-15,16-25,20-30,22-26”
//Write a program which displays the following 
//output: 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30

package assignment2_2;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNoDisplay {
    public static void main(String[] args) {
      //	int[] arr = { 1, 2, 2, 3, 3 ,7,6,7,9,6};
  
      Scanner input=new Scanner(System.in);
        System.out.println("Enter How Many Inputs  :  ");
        int no=input.nextInt();
        int arr[]=new int[no];
        System.out.println("Enter number  :  ");
        for(int i=0;i<no;i++)
        {
          arr[i]=input.nextInt();
             
         }
          
      	UniqueNoDisplayCalculation unc=new UniqueNoDisplayCalculation();
         unc.removeDuplicates(arr);
	
    }


}