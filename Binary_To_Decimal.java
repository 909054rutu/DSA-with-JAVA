public class Binary_To_Decimal {
    public static void BinToDec(int binNo){
        int pow=0;
        int DeciNo=0;
        int MyNum=binNo;
        while(binNo>0){
           int LastDig=binNo%10;
           DeciNo=DeciNo+(LastDig*(int)Math.pow(2,pow));

           pow++;
           binNo=binNo/10;

        }
        System.out.println("Binary To Decimal"+MyNum+" ="+DeciNo);
    }
    public static void main(String args[]){
        BinToDec(101);
    }
    
}
