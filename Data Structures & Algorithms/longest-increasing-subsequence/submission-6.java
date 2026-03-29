class Solution {
    Integer[][] cache;
    public int lengthOfLIS(int[] nums) {
        cache = new Integer[nums.length][nums.length+1];
        return dfs(nums, 0, -1);
    }

    private int dfs(int[] nums, int cur, int prev) {

        if(cur >= nums.length)
            return 0;
        if(cache[cur][prev+1] != null) return cache[cur][prev+1];
        int include = 0;
        if(prev == -1 || nums[cur] > nums[prev]) 
            include = 1 + dfs(nums, cur+1, cur);
        int skip = dfs(nums, cur+1, prev);

        cache[cur][prev+1] = Math.max(include, skip);
        return cache[cur][prev+1];

    }
}
