package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,4,6,8,9,10,15,18,19,21,26,60,67,69,80};
        System.out.println(ans(arr,69));
    }

    static int ans(int[] arr, int target){
        int s = 0;
        int e = 1;
        while (target > arr[e]){
            int newS = e + 1;
            e = e + (e - s + 1)  * 2;
            s = newS;
        }
        return search(arr, target,s, e);
    }
    static int search(int[] arr, int target, int s, int e){

        while(s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target){
                s = mid + 1;
            } else if (arr[mid] > target){
                e = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
