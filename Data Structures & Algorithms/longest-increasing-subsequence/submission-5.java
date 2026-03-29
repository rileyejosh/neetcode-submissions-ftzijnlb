class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Integer[][] memo = new Integer[nums.length][nums.length + 1];
        return dfs(nums, 0, -1, memo);
    }

    private int dfs(int[] nums, int i, int prevIdx, Integer[][] memo) {
        if (i >= nums.length) return 0;
        if (memo[i][prevIdx + 1] != null) return memo[i][prevIdx + 1];

        int include = 0;
        if (prevIdx == -1 || nums[i] > nums[prevIdx]) {
            include = 1 + dfs(nums, i + 1, i, memo);
        }
        int exclude = dfs(nums, i + 1, prevIdx, memo);

        memo[i][prevIdx + 1] = Math.max(include, exclude);
        return memo[i][prevIdx + 1];
    }
}