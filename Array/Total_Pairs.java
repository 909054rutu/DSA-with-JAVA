import java.util.*;
public class Total_Pairs {

    public static void subArray(int numbers[]){
        int t=0;
        for(int i=0;i<numbers.length;i++){
           int start=i;
            for(int j=i;j<numbers.length;j++){
               int end=j;
              
                for(int k=start;k<=end;k++) {
                    System.out.print(numbers[k]+" ");
                   
                   
                }    
                t++;
                System.out.println();
                
        }
        
        System.out.println();
    }
   
    System.out.println("Total Pairs="+t);

}
public static void main(String args[]){
    int numbers[]={1,2,3,4,5};
    subArray(numbers);
}
}

