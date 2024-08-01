/*Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your method*/


/*public class p_q_function2 {
    public static boolean isEven(int n){
        boolean isEven=false;
        
        if(n%2==0){
            isEven=true;    
 }
 return isEven;
    }
    public static void main(String args[]){
        System.out.println(isEven(2));
    }
    

    }*/
    import java.util.*;
    public class p_q_function2 {
        public static boolean isEven(int n){  
            if(n%2==0){
                return true;  
            }else{
     return false;
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number");
            int n=sc.nextInt();
            if(isEven(n)){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }

        }
    }
        
    
        
