package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 3, 9};
        System.out.println(search(arr, 3));
    }

    //search in the array
//    return index
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //chech for every element if element == target
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int search2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int ele : arr) {
            if (ele == target) {
                return ele;
            }
        }
        return -1;
    }

    //return true or false
    static boolean search3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int ele : arr) {
            if (ele == target) {
                return true;
            }
        }
        return false;
    }
}

