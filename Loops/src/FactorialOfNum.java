import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for get a factorial of that number : ");
        int temp = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= temp; i++){
            ans *= i;
        }
        System.out.println(ans);
    }
}
