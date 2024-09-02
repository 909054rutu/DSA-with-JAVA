public class insertion_sort {
    public static void insertion(int arr[]){
        //inner loop
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
             int j=i-1; //j===prev//
            while(j >=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
        public static void printarr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
    public static void main(String args[]){
        int arr[]={5,3,1,2,4};
        insertion(arr);
        printarr(arr);
    }
}
