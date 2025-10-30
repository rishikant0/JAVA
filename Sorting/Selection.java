public class Selection{
    public static void selection(int arr[]) {
        for(int turn =0;turn<arr.length-1;turn++){
            int min=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] =arr[turn];
            arr[turn] =temp;
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={12,21,02,30,22};
        selection(arr);
        printArr(arr);
    }
}