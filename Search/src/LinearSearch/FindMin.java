package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 3, 9, -4};
        System.out.println(min(arr));
    }


    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
