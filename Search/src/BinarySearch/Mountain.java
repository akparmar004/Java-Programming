package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length;
        while (s < e){
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]){
                e = mid;
            }else {
                s = mid + 1;
            }
        }
        return s;
    }
}
