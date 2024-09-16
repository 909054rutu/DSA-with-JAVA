public class SPIRAL_MATRIX {
    public static void spiral_matrix(int matrix[][]){
        int start_row=0;
        int start_col=0;
        int last_row=matrix.length-1;
        int last_col=matrix[0].length-1;
        }
        //top
        while(start_row<=last_row && start_col<=last_col)
        for(int i=start_col;i<=last_col;i++){
            System.out.print(matrix[start_row][i]+" ");   
        }

        //Right
        for(int i=start_row+1;i<=last_row;i++){
            System.out.print(matrix[i][start_col]+" ");
        }
         
        //down
        for(int i=last_col-1;i>=start_col;i--){
            if(start_row==last_row){
            break;
            }
            System.out.print(matrix[last_row][i]+" ");
        }

        //left
        for(int i=last_row-1;i>=start_row+1;i--){
            if(start_col==last_col){
                break;
            }
            System.out.print(matrix[i][start_col]+" ");
        }

        puublic static void main(String args[]){
            int matrix[][]={
                {1,23,4,5},
                {12,13,14,15},
                {16,17,18,19}
            };
            spiral_matrix(matrix);
        }
}
