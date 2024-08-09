import java.util.*;
public class SubArray_Sum {
    public static void subArray(int numbers[]){
        int s=0;
        for(int i=0;i<numbers.length;i++){
           int start=i;
            for(int j=i;j<numbers.length;j++){
               int end=j;
               s=0;
                for(int k=start;k<=end;k++) {
                 System.out.print(numbers[k]+" ");
                s=s+numbers[k];
                }
                System.out.print("Sum:"+s);
                System.out.println();
        }
        
        System.out.println();
    }
}
public static void main(String args[]){
    int numbers[]={1,2,3,4,5};
    subArray(numbers);
}
}


    