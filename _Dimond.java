/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */


public class _Dimond {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star odd number
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
    for(int i=n;i>=0;i--){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //star odd no
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  
    }
    public static void main(String args[]){
        pattern(5);
    }
}

