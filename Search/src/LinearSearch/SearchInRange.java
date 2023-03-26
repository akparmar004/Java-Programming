package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 3, 9};
        System.out.println(search(arr, 9,0,3));
    }
    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            //chech for every element if element == target
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
