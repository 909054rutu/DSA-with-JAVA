import java.util.*;
public class isprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n==2){
            System.out.print("is prime");
        }
        for(int i=2;i<n;i++)
        // for(int i=2;i<math.sqrt(n);i++)
        {
            if(n%2==0){
                isprime=false;
            }
        }
            if(isprime==true){
                System.out.print("number is prime");
            }
                else{
                System.out.print("numbre is not prime");
                }
            }

        }

    

