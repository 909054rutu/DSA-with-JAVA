
// Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case

import java.util.*;
public class p_q_conditional3 {
    public static void main(String args[]){
        int week;
        
           do{
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter WEEK No (1-7)");
           week=sc.nextInt();
        switch(week){
         case 1:System.out.print("Sunday");
                  break;
         case 2:System.out.print("Monday");
         break;
         case 3:System.out.print("Tuesday");
         break;
         case 4:System.out.print("Wednesday");
         break;
         case 5:System.out.print("Thrusday");
         break;
         case 6:System.out.print("Friday");
         break;
         case 7:System.out.print("Staurday");
         break;
         default:System.out.print("Invalid ");
        }
        }while(week<9);
    }
}

