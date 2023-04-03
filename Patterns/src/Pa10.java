public class Pa10 {
    public static void main(String[] args) {
        //1  2  3  4  5
        //6  7  8  9  10
        //11 12 13 14 15
        //16 17 18 19 20
        //21 22 23 24 25
        int n = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < 2) {
                    System.out.print(n + "  ");
                    n++;
                }else {
                    System.out.print(n + " ");
                    n++;
                }
            }
            System.out.println();
        }
    }
}
