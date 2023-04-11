public class FirstAndLastIndex {
    public int[] searchRange(int[] nums, int target) {

       int[] ans = {-1,-1};

       ans[0] = search(nums,target,true);
       ans[1] = search(nums,target,false);
       return ans;
    }

    int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        if (nums.length == 0){
            return -1;
        }

        while(s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < target){
                s = mid + 1;
            }
            if (nums[mid] > target) {
                e = mid - 1;
            } else {
                ans = mid;
                if (findStartIndex){
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}
