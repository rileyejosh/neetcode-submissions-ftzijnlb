class Solution {
    public int findMin(int[] nums) {
        int min = 0;

        // find the mid point that separates two arrays
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while(lo > 0 && hi < nums.length) {
            int mi = (lo+hi)/2;
            if(nums[mi] > nums[mi-1] && nums[mi] > nums[mi+1]) {
                mid = mi;
                break;
            } else if(nums[mi] > nums[mi-1] && nums[mi] < nums[mi+1]) {
                hi = mid+1; 
            } else if(nums[mi] < nums[mi-1] && nums[mi] < nums[mi+1]) {
                lo = mid-1;
            }
        }

        lo = 0;
        hi = mid;
        min = nums[lo];
        while(lo <= hi) {
            min = Math.min(min, nums[lo]);
            lo++;
        }

        lo = mid+1;
        hi = nums.length;
        while(lo < hi) {
            min = Math.min(min, nums[lo]);
            lo++;
        }
    

 
        return min;
    }
}
