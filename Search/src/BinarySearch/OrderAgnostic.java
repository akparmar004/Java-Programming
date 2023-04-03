package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
//        int[] arr = {1,4,7,11,16,19,22,27};
        int[] arr = {90,67,50,43,33,23,10,9,3,1,-10};
        System.out.println(search(arr,90));
    }
    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length;
        boolean isAsc = arr[s] < arr[e - 1];

        if (arr.length == 0){
            return -1;
        }

        while(s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] ==  target){
                return mid;
            }

            if (isAsc){
                if (arr[mid] > target){
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }else {
                if (arr[mid] < target){
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
