public class MergeSort {
    public static void main(String[] args){ 

        int [] arr={10,27,15,38};

        mergeSort(arr,0,arr.length-1);

        







    }
    public static void mergeSort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        
        int mid= low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
    }

    public  static  void merge(int[]arr,int low,int mid,int high){
        int[] temp= new int[high-low+1];

        int i =low;


    }


}
