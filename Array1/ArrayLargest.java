public class ArrayLargest{
    public static int  greatestNum(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }

        }
        System.out.println("smallest Number is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[]={12,21,33,20,19};
        System.out.println("largest value is :"+greatestNum(num));

        }
}