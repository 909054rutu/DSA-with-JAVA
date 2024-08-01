public class hollow_pattern {
    public static void hollPattern(int totRows,int totCols){
        //outer forloop
        for(int i=1;i<=totRows;i++){
            // inner forloop
            for(int j=1;j<=totCols;j++){
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("!");
                }else{
                    System.out.print(" ");
                }
              
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
       hollPattern(4, 5);
    }
}
/*!!!!!
  !   !
  !   !
  !!!!!*/