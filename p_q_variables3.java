// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, 
// a pen andan eraser. 
// You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem



import java.util.*;
public class p_q_variables3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pencil cost");
        int pencil=sc.nextInt();
        System.out.println("Enter pen cost ");
        int pen=sc.nextInt();
        System.out.println("Enter eraser cost");
        int eraser=sc.nextInt();
        int Total=pencil+pen+eraser;
        int GST=(pencil+pen+eraser)*18/100;
        float Bill=Total+GST;
        System.out.println("Total Cost="+Total);
        System.out.println("GST="+GST);
        System.out.println("Final Bill="+Bill);

    }
    
}
