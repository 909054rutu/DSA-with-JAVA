import java.util.*;
public class subArraySumM {
    public static void maxSum(int numbers[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                curr=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    curr=curr+numbers[k];
                    
                }
                System.out.println("Sum:"+curr);
                if(max<curr){
                    max=curr;
                }
                
            }
            System.out.println();
          
        }
        System.out.println("Max="+max);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        maxSum(numbers);
    }
}
