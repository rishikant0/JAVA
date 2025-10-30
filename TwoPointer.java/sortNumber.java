
import java.util.Scanner;

public class sortNumber{
    public static void printArray(int arr[]) {
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int lo,int hi) {
        int temp =arr[lo];
        arr[lo]=arr[hi];
        arr[lo]=temp;
    }
    public static void sort(int arr[]) {
        int n = arr.length;
        int lo =0;
        int hi =n-1;
        while(lo<hi){
            if(arr[lo]==1 && arr[hi] ==1){
                swap(arr,lo,hi);
                lo++;
                hi--;

            }else if(arr[lo]==0){
                lo++;
            }else{
                hi--;
            }
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of input");
        int n =sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the element ");
        for(int i =0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("origanal Array : ");
        printArray(arr);
        sort(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
}