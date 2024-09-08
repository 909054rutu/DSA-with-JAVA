public class Count_sort {
    public static void count_s(int arr[]){
            int maxv=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                maxv=Math.max(maxv,arr[i]);
            }
            int count[]=new int[maxv+1];
                for(int i=0;i<arr.length;i++){
                    count[arr[i]]++;
                }
            
            //sort
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            
        }
    }
}
    
        public static void ptr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
        public static void main(String args[]){
            int arr[]={3,4,4,6,8,9,3,2,3,1,1,1};
            count_s(arr);
            ptr(arr);
        }
    

}
