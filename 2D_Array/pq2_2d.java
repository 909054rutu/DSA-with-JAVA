public class pq2_2d {
    public static void sum2r(int matrix[][]){
        int sum=0;
        int i=matrix.length;
        int j=matrix[0].length-1;
    //     for(i=0;i<matrix.length;i++){
    //         for(j=0;j<matrix[0].length;j++){
    //             if(i==1){
    //             sum+=matrix[i][j];
    //         }
    //      }
    //        
    //     }
    //       System.out.println("Sum Of 2 Row:"+sum);
    // }

     
        if(i<=1){
        System.out.println("2 Row Not Exit");
        }else{
          for(j=0;j<matrix[0].length;j++){
          sum+=matrix[1][j];
        }
      }
      System.out.println(sum);
    }

    public static void main(String args[]){
        int matrix[][]={{1,4,9},
                        {11,4,3},
                        {7,6,8}};

                  sum2r(matrix);
    }

}

