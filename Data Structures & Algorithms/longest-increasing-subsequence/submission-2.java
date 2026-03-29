class Solution {

    public int lengthOfLIS(int[] nums) {

        return dfs(nums, 0, Integer.MIN_VALUE);  
    }

private int dfs(int[] nums, int i, int j) {
    if (i >= nums.length)
        return 0;
    int include = 0;
    if(nums[i] > j)
        include = 1 + dfs(nums, i + 1, nums[i]); 
    int exclude = dfs(nums, i + 1, j);
    return Math.max(include, exclude);  
}
}
