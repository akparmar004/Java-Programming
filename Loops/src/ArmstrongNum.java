import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arm(n));
    }

    static boolean arm(int n) {
        int temp = n;
        int ans = 0;
        int r;
        while(temp > 0){
            r = temp % 10;
            ans = ans + (r*r*r);
            temp /= 10;
        }
        return (n == ans);
    }
}
