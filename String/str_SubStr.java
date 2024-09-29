public class str_SubStr {
    public static String substr(String s,int se,int ed){
        String str="";
        for(int i=se;i<ed;i++){
           str+=s.charAt(i);
        }
        return str;
    }
    public static void main(String args[]){
        String s="HelloWorld";
        System.out.println(substr(s, 0, 5));
    }
}
