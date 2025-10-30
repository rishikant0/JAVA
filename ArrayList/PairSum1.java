import  java.util.ArrayList;
public class PairSum1{

    //2 pointer approach
//      public static boolean  pairSum(ArrayList<Integer> list,int sum){
//    int lp=0,rp=list.size()-1;
         
//    while(lp!=rp){
//        //case 1
//        if(list.get(lp)+list.get(rp)==sum){
//            return true;
//      }
//      //case 2
//     if(list.get(lp)+list.get(rp)<sum){
//         lp++;
//     }else{
//         rp--;
//     }
    
// }
//     return false;
//}

//Brute force Approach
public static boolean  pairSum(ArrayList<Integer> list,int sum){
    
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i)+list.get(j)==sum){
                return true;
            }
        }
    }
    return false;

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