public class pq3_2dT {
    public static void swap(int matrix[][]){
        int n=matrix.length,m=matrix[0].length;

        int[][] array=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transpose-Matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
    }
    System.out.println();
}
    }
public static void main(String args[]){
    int matrix[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}
};
System.out.println("Orignal-Matrix");
for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
        System.out.print(matrix[i][j]+" ");
    }
     System.out.println();
}
swap(matrix);
}
}
