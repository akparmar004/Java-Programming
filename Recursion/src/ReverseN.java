public class ReverseN {
    public static void main(String[] args) {
//    rev(1234);
//        System.out.println(sum);
        System.out.println(rev2(1234));
    }
    static int sum = 0;
    public static void rev(int n){
        if (n == 0){
            return;
        }
        sum = (sum * 10) + (n % 10);

        rev(n/10);
    }

    public static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);

    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return n%10 * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
