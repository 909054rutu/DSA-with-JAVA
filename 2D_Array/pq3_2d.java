public class pq3_2d {
    public static void transpose(int matrix[][]){
        int row=matrix.length-1,col=matrix[0].length-1;

        // for(row=0;row<matrix.length;row++){
        //     for(col=0;col<matrix[0].length;col++){
        //         int temp=matrix[row][col];
        //         matrix[row][col]=matrix[col][row];
        //         matrix[col][row]=temp;
        //     }
        
        for(row=0;row<matrix.length;row++){
            for(col=0;col<matrix[0].length;col++){
                System.out.print(matrix[col][row]+" ");
     }
     System.out.println();
   }
}
    public static void main(String args[]){
        int matrxi[][]={{1,2,3},
                        {4,5,6},
                        {8,9,10}};
            transpose(matrxi);

    }
}
