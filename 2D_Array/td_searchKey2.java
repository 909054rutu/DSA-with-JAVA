public class td_searchKey2{
    public static boolean stairKey(int matrix[][],int key){
        int row=matrix.length-1,col=0;
        while(col<matrix[0].length && row>=0){
            if(matrix[row][col]==key){
                System.out.println("Key Found("+row+","+col+")");
                return true;
            }else if(key<=matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
     public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
        {15,25,35,45},
        {27,37,47,57},
        {32,40,90,60}};
              int key=57;
              stairKey(matrix,key);
     }
    
}
