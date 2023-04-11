public class Palindrome {
    public static void main(String[] args) {
        boolean ans = palindrome(1223221,1223221);
        System.out.println(ans);
    }
    public static boolean palindrome(int n,int temp){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits) == temp;

    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return n%10 * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
