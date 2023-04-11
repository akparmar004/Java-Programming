public class CheckSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(check(arr,0));
    }


    public static boolean check(int[] arr,int i){
        if (arr.length - 1 == i){
          return true;
        }

        return arr[i] < arr[i+1] && check(arr,i + 1);
    }
}
