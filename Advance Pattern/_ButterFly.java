/* 
*       * 
**     ** 
***   *** 
**** **** 
**********
**********
**** **** 
***   ***
**     **
*       *
*/




public class _ButterFly {
    public static void butterfly(int n){
        //first half outer for loop
        for(int i=1;i<=n;i++){
            //print first star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }
            //print last star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        //second half
           //inner for loop
           for(int i=n;i>=0;i--){
            //print first star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<(n-i)*2;j++){
                System.out.print(" ");
            }
            //print last star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();

           }

    }
    public static void main(String args[]){
           butterfly(5);
    }
    
}
