import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        //we will use Scanner class for take an input from user
        Scanner in = new Scanner(System.in);

        //we will use "in" variable for take input in any type of data we want...
        System.out.print("Enter Number : ");
        int a = in.nextInt();
        //then we'll print it
        System.out.println("Your Number is : " + a);

    }
}
