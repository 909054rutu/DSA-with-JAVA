public class selection_sort {
    public static void Selection(int arr[]){
        //[5,3,5,6]
        //[0,1,2,3]
        for(int i=0;i<arr.length-1;i++){
            //inner loop
            int minPos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,3,4,2,1};
        Selection(arr);
        printarr(arr);

    }
}
