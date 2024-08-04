import java.util.*;
public class array_1 {
    public static void main(String[] args) {
        int marks[]=new int[100];

        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("pyt :"+marks[0]);
        System.out.println("java :"+marks[1]);
        System.out.println("php :"+marks[2]);

         //update 1-way
        //  marks[2]=100;
        //  System.out.println("php :"+marks[3]);

        // 2-way

        marks[2]=marks[2]+1;
        System.out.println("php :"+marks[2]);
    }
    
}
