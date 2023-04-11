public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    public static int sum(int num){
        if (num == 0){
            return 0;
        }
        return (num%10) + sum(num/10);
    }
}
