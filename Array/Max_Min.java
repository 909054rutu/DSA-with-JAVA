import java.util.*;
public class Max_Min {
    public static int largest(int numbers[]){
        int largestNo=Integer.MIN_VALUE;
        int smallestNo=Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(largestNo<numbers[i]){
        largestNo=numbers[i];

    }
        if(smallestNo>numbers[i]){
            smallestNo=numbers[i];
        }
    }
        System.out.println("Smallest No:"+smallestNo);

    return largestNo;
}
public static void main(String args[]){
    int numbers[]={10,33,21,9,99,110};
    int large=largest(numbers);
    System.out.println("Largest No :"+large);
}
}
