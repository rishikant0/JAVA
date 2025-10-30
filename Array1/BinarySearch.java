public class BinarySearch{
    public static int  binar(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid =(start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
       int arr[] ={2,19,20,30,40,54};
       int key =20;
       
        System.out.println("index for key is : "+binar(arr,key));
       
   }
}