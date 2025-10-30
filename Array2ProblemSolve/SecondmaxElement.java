
import java.util.Scanner;

public class SecondmaxElement{
    public static int firstMax(int[] arr) {
        int mx =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        
            if(arr[i]>mx){
                mx =arr[i];
            }
    }
    return mx;
}
    public static int SecondMax(int[] arr) {
        int  max = firstMax(arr);
       for(int i=0;i<arr.length;i++){
        
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
               
            }
        }
        int secondmax = firstMax(arr);
        return secondmax;
        
       
       
       
    }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Size of array");
     int n = sc.nextInt();
     System.out.println("Enter the array");
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
     }

     System.out.print("SecondMAx value is "+SecondMax(arr));
 }
}