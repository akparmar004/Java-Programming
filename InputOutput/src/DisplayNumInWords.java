import java.util.Arrays;

public class DisplayNumInWords {
    public static void main(String[] args) {
        int num = 34838;
        String temp = Integer.toString(num);

        for (int i = 0; i < temp.length();i++){

            switch (temp.charAt(i)){
                case '0':
                    System.out.print("zero ");
                    break;
                case '1' :
                    System.out.print("one ");
                    break;
                case '2' :
                    System.out.print("two ");
                    break;
                case '3' :
                    System.out.print("three ");
                    break;
                case '4' :
                    System.out.print("four ");
                    break;
                case '5' :
                    System.out.print("five ");
                    break;
                case '6' :
                    System.out.print("six ");
                    break;
                case '7' :
                    System.out.print("seven ");
                    break;
                case '8' :
                    System.out.print("eight ");
                    break;
                case '9' :
                    System.out.print("nine ");
                    break;
            }
        }
    }
//    public static int length(int num){
//        int ans = 0;
//        while(num > 0){
//            num /= 10;
//            ans++;
//        }
//        return ans;
//    }
}
