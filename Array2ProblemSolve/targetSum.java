import java.util.Scanner;
public class targetSum{
    public static int ar(int[] arr,int tar){
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==tar){
               sum++;
            }
            }
           }
             return sum;
        }
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0;i<7;i++){
            arr[i] = sc.nextInt();
        }
        int target =5;
      
        // arr[0]=2;
        // arr[1]=3;
        // arr[2]=4;
        // arr[3]=5;
        // arr[4]=6;
        // arr[5]=9;
        // arr[6]=2;
        System.out.println(ar(arr,target));
       
        
    }
}