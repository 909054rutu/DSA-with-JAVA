import java.util.*;
public class array_call_ref {
    public static void update(int marks[],int nonChangble){
        nonChangble=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={99,90,97};//chage value array is call by refernces
        int nonChangble=5;//not change value call by value
        update(marks,nonChangble);
        System.out.println(nonChangble);
         //print our marks
         for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
         }
         
    }
    
}
