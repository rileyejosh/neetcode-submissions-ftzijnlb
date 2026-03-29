class Solution {
    public int maxSubArray(int[] nums) {
        int N = nums.length;
        int maxSum = nums[0];
        int sum = 0;

        for(int n : nums) {
            if(sum < 0)
                sum = 0;
            sum+=n;
            maxSum = Math.max(maxSum, sum);
            
        }
        
        // for(int i = 0; i < N; i++) {
        //     for(int j = i; j< N; j++) {
        //         int sum = 0;

        //         //iterate through the subarray
        //         for(int l = i; l <= j; l++) {
        //             sum+=nums[l];
        //         }
        //         // check if sum of curr subarray is max
        //         maxSum = Math.max(maxSum, sum);
        //     }
        //  }
        return maxSum;
    }
}
