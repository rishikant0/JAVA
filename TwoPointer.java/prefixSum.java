import java.util.Scanner;
public class prefixSum{
    public static void perfix(int arr[]) {
       int  sum =0;
       int n = arr.length;
        for(int i=0;i<n;i++){
             sum +=arr[i];
             System.out.print(sum+" ");
        }
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
    perfix(arr);
}
}