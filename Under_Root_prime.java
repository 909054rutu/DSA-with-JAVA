//optimize function
public class Under_Root_prime {
        public static boolean isPrime(int n){
            //corner case
            if(n==2){
                return true;
            }
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                isPrime=false;
                break;
                }
            }
        return isPrime;
        }
        public static void main(String args[]){
            System.out.println(isPrime(12));
        }
        }
    



