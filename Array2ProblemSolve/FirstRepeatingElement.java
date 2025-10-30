
import java.util.Scanner;

public class FirstRepeatingElement{
    public static int firstMax(int[] arr) {
       int mx =0;
        for(int i=0;i<arr.length;i++){
        for(int j =i+1;j<arr.length;j++){
          if(arr[i]==arr[j]){
            return arr[i];
           
          }
        }
           
    }
    return -1;
}
public static int LastMax(int[] arr) {
    int mx =0;
     for(int i=arr.length-1;i>=0;i--){
     for(int j =i-1;j>=0;j--){
       if(arr[i]==arr[j]){
         return arr[i];
        
       }
     }
        
 }
 return -1;
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

     System.out.println("First Repeatation element is "+firstMax(arr));
     System.out.print("Last Repeatation element is "+LastMax(arr));
 }
}