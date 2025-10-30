public class LinearSearch{
    public static int  liner(int arr[], int key) {
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }return -1;
    }
   public static void main(String[] args) {
       int arr[] ={12,11,3,24,3,20,30};
       int key =20;
       int index = liner(arr,key);
       if(index == -1){
        System.out.println("NOt found");
       }else{
        System.out.println("Key is at index : "+index);
       }
   }
}