public class triplateSum{
      public static int ar(int[] array,int target) {
          int n = array.length;
          int ans=0;
          for(int i=0;i<n;i++){
            for(int j =i+1 ;j<n;j++){
                for(int k =j+1;k<n;k++){
                 if(array[i]+array[j]+array[k]==target){
                    ans++;
                 }
                }
            }
          }
          return ans;
      }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target=9;
       System.out.print(ar(arr,target));
    }
}