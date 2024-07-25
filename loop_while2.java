import java.util.*;
public class loop_while2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range:");
        int range=sc.nextInt();
       
        int counter=1;
        while(counter<=range){
            System.out.print(counter+" ");
            counter++;
        }
    }
}