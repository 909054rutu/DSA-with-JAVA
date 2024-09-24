import java.util.*;
public class TWD {
    public static void disp(int matrix[][]){
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){


                System.out.print(matrix[row][col]+" ");
        }
        System.out.println();
        
    }
}
public static void main(String args[]){
    int matrix[][]=new int[3][3];
    int n=matrix.length,m=matrix[0].length;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           matrix[i][j]=sc.nextInt();
        }
    }
    disp(matrix);
}

}
