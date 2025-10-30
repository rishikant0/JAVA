public class foreachloop{
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=12;
        arr[1]=13;
        arr[2]=72;
        arr[3]=63;
        arr[4]=52;
        arr[5]=43;
        arr[6]=32;
        arr[7]=23;
        arr[8]=10;
        arr[9]=15;
        for(int x : arr){
            System.out.println(x);
        }
    }
}