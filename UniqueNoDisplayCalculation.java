//Question 2.2.2) Given input: “1,2,3,4,5-8,6-10,8-15,16-25,20-30,22-26”
//Write a program which displays the following 
//output: 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30


package assignment2_2;

import java.util.Arrays;
public class UniqueNoDisplayCalculation {
    public void removeDuplicates(int[] A) {
	if (A.length < 2)
		System.out.println("At least two no. input is required");
 
	int j = 0;
	int i = 1;
        Arrays.sort(A);
	while (i < A.length) {
            
		if (A[i] == A[j]) 
                {
			i++;
		} 
                else 
                        {
			j++;
			A[j] = A[i];
			i++;
                        }
                
	}
 
	int[] B = Arrays.copyOf(A, j + 1);
        System.out.println("Output ");
        for(int f=0;f<B.length;f++)
        {
 System.out.print(B[f]+",");
        }	

}
 
}