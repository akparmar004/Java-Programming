public class DisplayDigits {
    public static void main(String[] args) {
        int n = 123;
        int r;
        int num = 0;
        while (n > 0){
            r = n % 10;
            num = num * 10 + r;
            n /= 10;
        }
        while (num > 0){
            r = num % 10;
            System.out.println(r);
            num /= 10;
        }

    }
}
