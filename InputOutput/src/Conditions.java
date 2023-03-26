import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
//        int b = in.nextInt();

//        if (a == b){
//            System.out.println("a is equal to b");
//        }else {
//            System.out.println("a is not equal to b");
//        }

//        if (a % 2 == 0){
//            System.out.println("Your number is even.");
//        }else {
//            System.out.println("Your number is odd.");
//        }

    //****************   we check the number is odd or even using bitwise operator *****************
        
        if ((a & 1) == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }
}
