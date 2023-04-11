public class DisplayDigits {
    public static void main(String[] args) {
        int num = 123;
        int n = reverse(num);

        while (n > 0){
            System.out.println(n % 10);
            n /= 10;
        }
    }

    static int reverse(int num) {
        int temp = 0;

        while (num > 0){
            temp = (temp * 10) + (num % 10);
            num /= 10;
        }
        return temp;
    }
}
