/*Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321*/

import java.util.*;
public class p_q_function3 {
    public static boolean isPalin(int n){
        int n1=n;
         int rev=0;
        while(n>0){
            int d=n%10;
         rev=rev*10+d;
            n/=10;
        }
        if(rev==n1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number");
     int n=sc.nextInt();
     if(isPalin(n)){
        System.out.println("Palindrome");
     }else{
        System.out.println("Not Palindrome");
     }
    }

    }

