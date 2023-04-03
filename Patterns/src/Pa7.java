public class Pa7 {
    public static void main(String[] args) {
//            1
//           ABA
//          12321
//         ABCDCBA
//        123454321

        int n = 5;
        int space = 5;
        int num1 = 1;
        int num2 = 2;
        char ch1 = 'A';
        char ch2 = 'A';
        int tempCh2 = 1;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < space ; j++) {
                System.out.print(" ");
            }
            space--;

            if (i % 2 != 0){
                for (int k = 1; k <= num1 ; k++) {
                    System.out.print(k);
                }
                num1 += 2;
                if (i > 2){
                    int temp = num2;
                    for (int l = 1; l <= num2 ; l++) {
                        System.out.print(temp);
                        temp--;
                    }
                    num2 += 2;
                }
            }else {
                char temp1 = ch1;
                for (int m = 1; m <= num2 ; m++) {
                    System.out.print(temp1);
                    temp1++;
                }
                char temp2 = ch2;
                for (int o = 1; o <= tempCh2; o++){
                    System.out.print(temp2);
                    temp2--;
                }
                ch2 += 2;tempCh2+=2;
            }
            System.out.println();
        }
    }
}
