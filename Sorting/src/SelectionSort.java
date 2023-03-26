import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,6,-10,-2,0};
        selection(arr);
//        System.out.println(min(arr, 0,arr.length -1));
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
//            int last = arr.length - i - 1;
//            int max = max(arr,0,last);
            int first = i;
            int minIndex = min(arr,0 + i,arr.length - 1);

            swap(arr, first, minIndex);
        }
    }

    static int min (int[] arr, int start, int end){
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    static int max (int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }


    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
