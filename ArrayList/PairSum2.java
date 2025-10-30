
import java.util.List;

public class PairSum2{
    //2 pointer approach
    public static boolean  pairSum(ArrayList<Integer> list,int sum){
        int bp =-1;
        for(int i=0;i<List.size();i++){
            if(list.get(i)>sum){
                bp = i;
                break;
            }
        }
        int lp =bp+1;
        int rp =bp;
        while(lp!=rp){
            //case 1
            if(list.get(lp)+list.get(rp)==sum){
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)<sum){
                lp++;
            }else{
                rp--;
            }
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(5);
        list.add(6);
        int sum = 8;
        System.out.println(pairSum(list,sum));
    }
    
}

