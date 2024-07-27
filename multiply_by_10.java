import java.util.*;
public class multiply_by_10 {
    public static void main(String args[]){
        do{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Your Number");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);

    }
    
}
