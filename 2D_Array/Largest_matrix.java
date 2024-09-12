
import java.util.*;
public class Largest_matrix {
    public static void largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;
        int r=-1;
        int c=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             largest=Math.max(largest,matrix[i][j]);
             r=i;
             c=j;
            }
        }
    System.out.println(largest+"("+r+","+c+")");
      
    
}
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int m=matrix.length,n=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
     
        //  int p=largest(matrix);
        //  System.out.println(p);
        largest(matrix);
    }
}
