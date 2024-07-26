import java.util.*;
public class loop_sum_of_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int s=0;
        int i=1;
        while(i<=n){
            // s=s+i;
            s+=i;
            i++;
            
         
        }
        System.out.print("sum"+s);
    }
    
}
