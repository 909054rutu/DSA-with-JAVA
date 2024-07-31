public class Decimal_To_Binary {
    public static void DecToBin(int DecNo){
        int pow=0;
        int BinNo=0;
         int MyNo=DecNo;
          while(DecNo>0){
            int rem=DecNo%2;
            BinNo=BinNo+(rem*(int)Math.pow(10,pow));
            pow++;
            DecNo=DecNo/2;


          }
          System.out.println("Binary Form Of="+MyNo+" "+BinNo);
    }
    public static void main(String args[]){
        DecToBin(7);
    }
}
