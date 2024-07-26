import java.util.*;

public class reverse_given_no {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number:");
    int n=sc.nextInt();
    int rev=0;
    while(n>0){
        int d=n%10;
        rev=rev*10+d;
        n=n/10;
    }
    System.out.println(rev);
    }
    
}
