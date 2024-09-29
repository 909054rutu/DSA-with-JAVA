public class str_equals {
    public static void main(String args[]){
        String str1="coder";
        String str2="coder";
        String str3=new String("coder");
        // if(str1==str2){
        //     System.out.println("String Are same");
        // }else{
        //     System.out.println("String are not same");
        // }
        // if(str1==str3){
        //     System.out.println("String Are same");
        // }else{
        //     System.out.println("String are not same");
        // }//not same str3 create new string
        if(str1.equals(str3)){ //check value
            System.out.println("String Are Same");
        }else{
            System.out.println("String Are Not Same");
        }
    }
}
