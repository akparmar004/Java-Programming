public class Pa5 {
    public static void main(String[] args) {
//             *
//           * * *
//         * * * * *
//           * * *
//             *
        int star = 1;
        int space = 5 / 2;

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= space ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star ; k++) {
                System.out.print("* ");
            }
            if (i <= 5/2){
                star += 2;
                space--;
            }else {
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }
}
