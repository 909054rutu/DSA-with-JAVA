public class pq1_2d {
    public static void count(int matrix[][]){
       int  i=matrix.length-1 ,j=matrix[0].length-1;
       int count7=0;
       for(i=0;i<matrix.length;i++){
        for(j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==7){
                count7++;
            }
        }
      
    }
    System.out.print("ToTol No Of Time:"+count7);
}
   public static void main(String args[]){
    int matrix[][]={{2,3,4,7},
                    {4,5,6,7}
   };
        count(matrix);

}
}