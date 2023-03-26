public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,12,15};
        int ans = search(arr,1,0,arr.length);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int s,int e){
        if (s > e){
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (target == arr[mid]){
            return mid;
        }
        if (arr[mid] > target){
            return search(arr,target,s,mid - 1);
        }
        return search(arr,target,mid + 1,e);
    }
}
