//optimize function
public class prime_in_Range{
    public static boolean isPrime(int n){
        //corner case
        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
           return false;
            }
        }
    return true;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+"  ");
            }
        }
    }
    public static void main(String args[]){
        primeRange(20);
    }
    }




