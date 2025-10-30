public class FriendsParing {
    public static int friendsParing(int n){
        if(n==1 ||n==2){
            return n;
        }
        return friendsParing(n-1) + friendsParing(n-2)*(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsParing(n));
    }
}