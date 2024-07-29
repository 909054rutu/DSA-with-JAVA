import java.util.*;
/*public class function_param {
    public static void calculate(int num1,int num2){ 
         int sum=num1+num2;
         System.out.println("sum is="+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculate(a,b);
    }
}*/
import java.util.*;
public class function_param {
    public static int calculate(int num1,int num2){ //formal parameters
         int sum=num1+num2;
         return sum;
         
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculate(a,b);//argument actual parameter
        System.out.println("sum is="+sum);
    }
}

// import java.util.*;
// public class function_param {
//     public static void calculate(int num1,int num2){ 
//          int sum=num1+num2;
//          System.out.println("sum is="+sum);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         calculate(a,b);
        
//     }
// }
