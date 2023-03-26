import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-2,2,1,7,-9,0,-10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    swap(arr,i,j);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    static void sort1(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
