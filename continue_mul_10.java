import java.util.*;
public class continue_mul_10 {
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Enter Your Number:");
        int n=sc.nextInt();
        if(n%10==0){
            continue;
        }
        System.out.println(n);
    }while(true);
}
}
