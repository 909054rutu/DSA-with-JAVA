public class Bubble_Sort_Tm {
    public static void Sort(int arr[]){   
      int swap=0;
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                //swap
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
            }            
        }      
    }
System.out.println("number of swap="+swap);
}
        public static void printarr(int arr []){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        // System.out.println();
        }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        Sort(arr);
        printarr(arr);
       
    }

}
