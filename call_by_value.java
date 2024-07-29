public class call_by_value {
    public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
        System.out.println("Valu A="+a);
        System.out.println("Valu B="+b);
    }
    public static void main(String args[]){
        int a=10;
        int b=20;
        swap(a,b);
    }
}

/*public class call_by_value {
    public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
        
    }
    public static void main(String args[]){
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("Valu A="+a);
        System.out.println("Valu B="+b);
    }
}*/
