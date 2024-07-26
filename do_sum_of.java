public class do_sum_of {
    public static void main(String args[]){
        int n=1012;
        int s=0;
        do{
            int d=n%10;
            s+=d;
            n/=10;
        }while(n>0);
        System.out.print(s);
    }
    
}
