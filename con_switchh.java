import java.util.*;

public class con_switchh {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No 1:");
       int a=sc.nextInt();
       System.out.println("Enter No 2:");
       int b=sc.nextInt();
       System.out.println("Enter Choice + - * / %");
       char operator=sc.next().charAt(0);
       
       switch(operator){
        case '+':
        System.out.println(a+b);
        break;
        case '-':
        System.out.println(a-b);
        break;
        case '*':
        System.out.println(a*b);
        break;
        case '/':
        System.out.println(a/b);
        break;
        case '%':
        System.out.println(a%b);
        break;
        default:System.out.println("invalid choice");
       }
     

    }
    
}
