public class td_searchkey{
    public static boolean starisSearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;  //starting Point
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key Found ("+row+","+col+")");
                return true;
            }
            else if(key<=matrix[row][col]){
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key does not Exit");
        return false;

    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,37,47,57},
                        {32,33,39,40}};
        int key=57;
        starisSearch(matrix,key);
    }
}
