class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = -1000;
        int N = nums.length;
        for(int i = 0; i < N; i++) {
            for(int j = i; j< N; j++) {
                int sum = 0;
                for(int l = i; l <= j; l++) {
                    sum+=nums[l];
                }
                maxSum = Math.max(maxSum, sum);
            }
         }
        return maxSum;
    }
}
