import java.util.Scanner;

public class SumOfNnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a target Number : ");
        int temp = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= temp; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
