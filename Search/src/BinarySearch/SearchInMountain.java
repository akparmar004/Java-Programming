package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {4,6,8,12,9,7,2};
        int ans = search(arr,12);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        if (peak == target){
            return peak;
        }
        int firstTry = search1(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
         return search1(arr,target, peak+1,arr.length);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    static int search1(int[] arr, int target, int s, int e) {
        boolean isAsc = arr[s] < arr[e - 1];

        if (arr.length == 0) {
            return -1;
        }

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
