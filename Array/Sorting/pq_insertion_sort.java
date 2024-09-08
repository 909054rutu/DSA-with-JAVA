public class pq_insertion_sort {
    public static void id(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;

        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,4,5,8,2,5,3,1};
        id(arr);
    }
}
