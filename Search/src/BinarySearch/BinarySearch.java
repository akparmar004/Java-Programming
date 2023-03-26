package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,11,16,19,22,27};
        System.out.println(search(arr,27));

    }
    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length;

        if (arr.length == 0){
            return -1;
        }

        while(s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target){
                s = mid + 1;
            }
            if (arr[mid] > target){
                e = mid - 1;
            }
            if (arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
