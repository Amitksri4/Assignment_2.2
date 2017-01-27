
//Question2.2.1) Given the berth number in a 3-tier AC compartment, 
//write a program to output whether it is a lower berth, upper berth, side lower berth, side upper berth.

package assignment2_2;

public class BerthConfirmationCalculation {
    
    int lb[]={1,4,9,12,17,20,25,28,33,36,41,44,49,52,57,60,65,68};
    int mb[]={2,5,10,13,18,21,26,29,34,37,42,45,50,53,58,61,66,69};
    int ub[]={3,6,11,14,19,22,27,30,35,38,43,46,51,54,59,62,67,70};
    int sl[]={7,15,23,31,39,47,55,63,71,-0,-0,-0,-0,-0,-0,-0,-0,-0};
    int su[]={8,16,24,32,40,48,56,64,72,-0,-0,-0,-0,-0,-0,-0,-0,-0};
 
    public void display(int bno)
    {
        if(bno<=72 && bno>0)
        {
         for(int i=0;i<lb.length;i++)
            {
                if(bno==lb[i])
                {
                    System.out.println("Lower Berth");
                    break;
                }
                else
                    if(bno==mb[i])
                    {
                        System.out.println("Middle Berth");
                        break;
                    }
                    else
                        if(bno==ub[i])
                        {
                            System.out.println("Upper Berth");
                            break;
                        }
                        else
                         if(bno==sl[i])
                          {
                                System.out.println("SideLower Berth");
                                break;
                            }
                            else
                                if(bno==su[i] )
                                {
                                    System.out.println("SideUpper Berth");
                                    break;
                                }
               }   
        }
         else {
            System.out.println("Only 72 berth are available in per Bogi , Pls enter correct berth no.");
               }
       
        
          
    }
}
