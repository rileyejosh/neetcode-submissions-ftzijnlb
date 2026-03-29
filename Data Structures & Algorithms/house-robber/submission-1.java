class Solution {
    private int[] cache;
    public int rob(int[] nums) {
        cache = new int[nums.length];
        return rob(nums, 0);
    }

    // Recursive bottom up approach
    private int rob(int[] nums, int i) {

        // we run out of houses to rob,
        // so return 0
        if(i >= nums.length) return 0;

        if(cache[i] > 0) return cache[i];

        /**
        We have two choices: 

        1) rob the current house and add the
        stolen money to the money stolen from the houses after 
        the next house

        2) skip the current house 
        */
        cache[i] = Math.max(nums[i] + rob(nums, i+2), rob(nums, i+1));
        return cache[i];
    }
}
