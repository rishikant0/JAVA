public class QuickSort{
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
 
    }
    public static void quicksort(int arr[] ,int si, int ei) {
        if(si>=ei){
            return;
    }
    //last element
    int PIDX = patition(arr,si,ei);
    quicksort(arr, si, PIDX-1);
    quicksort(arr, PIDX+1, ei);
    }

    public static int patition(int arr[],int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; //to make place for els smaller then pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,7,-5};
        quicksort(arr,0,arr.length-1);
        print(arr);
    }
}