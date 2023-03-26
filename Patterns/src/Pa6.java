public class Pa6 {
    public static void main(String[] args) {
        int n = 5;
        int space = 5;
        int num1 = 1;
        int num2 = 1;

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int k = 1; k <= num1 ; k++) {
                System.out.print(k);
            }
            num1++;
            if (i > 1){
                int temp = num2;
                for (int l = 1; l <= num2; l++){
                    System.out.print(temp);
                    temp--;
                }
                 num2++;
            }
            System.out.println();
        }
    }
}
