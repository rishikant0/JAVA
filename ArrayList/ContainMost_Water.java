import java.util.ArrayList;
public class ContainMost_Water{

    //Brute force approach
    // public static int StoreWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int width = j-i;
    //             int h = Math.min(height.get(i),height.get(j));
    //             int water = width*h;
    //             maxWater = Math.max(maxWater,water);
    //         }
    //     }
    //     return maxWater;

    // }

    //using 2 pointer approach
    public static int StoreWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){
            int width = rp-lp;
            int h = Math.min(height.get(lp),height.get(rp));
            int water = width*h;
            maxWater = Math.max(maxWater,water);

            //update the pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
            
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(StoreWater(height));
    }
}
