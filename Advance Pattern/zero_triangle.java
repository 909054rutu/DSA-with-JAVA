/*
1
01   
101  
0101 
10101
 */


public class zero_triangle {
    public static void pattern(int n){
        //inner for loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                

            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        pattern(5);
    }
    
}
