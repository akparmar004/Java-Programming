package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(search(arr,7));
    }
    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length;

        if (target > arr[arr.length - 1]){
            return arr.length;
        }

        while(s <= e) {
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
        return s;
    }
}
