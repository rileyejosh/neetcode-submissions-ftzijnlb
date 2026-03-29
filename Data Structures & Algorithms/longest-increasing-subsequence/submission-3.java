class Solution {
    public int lengthOfLIS(int[] nums) {
        return dfs(nums, 0, Integer.MIN_VALUE);
    }

    private int dfs(int[] nums, int cur, int prev) {
        if(cur >= nums.length)
            return 0;

        int maxLen = dfs(nums, cur+1, prev);
        // include cur element
        if(nums[cur] > prev)
            maxLen = Math.max(maxLen, 1 + dfs(nums, cur+1,nums[cur]));
        // exclude cur element
        else
            dfs(nums, 1+cur, prev);


        return maxLen;


    }
}
