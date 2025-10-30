public class concatinateString{
    public static void print(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String first ="Rishikant";
        String last ="Kumar";
        String fullName = first+" "+last;
        print(fullName);
        System.out.println(fullName);
    }
}