// Question 1 : Write a Java method to compute the average of three numbers..
import java.util.*;
// public class p_q_fun1 {
//     public static void avg(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Three Number");
//         int  n1= sc.nextInt();
//         int n2= sc.nextInt();
//         int n3= sc.nextInt();
//        int Total=n1+n2+n3;
//         float avg=Total/3;
//         System.out.print("Average="+avg);
//     }
    
//     public static void main(String args[]){
//       avg();
//     }
// }
public class p_q_function1{
  public static double avg_t(double n1,double n2,double n3){

    return (n1+n2+n3)/3;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
            System.out.println("Enter Three Number");
            int  n1= sc.nextInt();
            int n2= sc.nextInt();
            int n3= sc.nextInt();
            System.out.println(avg_t(n2,n2,n3));
  }
}