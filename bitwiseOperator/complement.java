import java.util.Scanner;

class Solution {

    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            sb.append(c == '0' ? '1' : '0');
        }

        return Integer.parseUnsignedInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.bitwiseComplement(n);

        System.out.println("Bitwise Complement: " + result);

        sc.close();
    }
}