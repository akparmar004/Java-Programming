package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Mountain {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
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
