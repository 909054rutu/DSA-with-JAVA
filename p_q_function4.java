/*Question 5 :
Write a Java method to compute the sum of the digits in an integer.*/

import java.util.*;
public class p_q_function4 {
    public static int sum_D(int n){
        int s=0;
        while(n!=0){
            int d=n%10;
            s=s+d;
            n=n/10;

        }
        return s;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        // int sum=sum_D(n);
        // System.out.println(sum_D(sum));
        System.out.println(sum_D(n));

    }
    
}
