import java.util.*;
public class Binary_S {
    public static int BinarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){//2nd half Right
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12};
        int key=12;
        System.out.println("Index Of Key:"+BinarySearch(numbers, key));
    }
}