public class Palindrome {
    public static void main(String[] args) {
        //palindrome means the reverse of a number is a same as original number...
        int n = 1223221;
        System.out.println(n == reverse(n));
    }
    public static int reverse(int n){
        int num = 0;
        int r;
        while(n > 0){
            r = n % 10;
            num = (num * 10) + r;
            n /= 10;
        }
        return num;
    }
}
