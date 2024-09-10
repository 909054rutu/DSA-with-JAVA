import java.util.*;
public class D_Matrix {
            //serch
        public static boolean serch(int matrix[][],int key){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==key){
            
                        System.out.println("found ("+i +"," +j +")");

                        return true;
                    }
                }
                
            }
            System.out.println("not found");
                return false;
        }
        public static void main(String args[]){
        int matrix[][]=new int[3][3];
       int m=matrix.length,n=matrix[0].length;  //3,3
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        serch(matrix, 5);
    }
    
}
