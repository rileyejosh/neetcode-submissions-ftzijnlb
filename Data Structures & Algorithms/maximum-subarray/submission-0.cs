public class Solution {
    public int MaxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        foreach(int n in nums) {
            sum = Math.Max(sum, 0);
            sum += n;
            max = Math.Max(sum, max);
        }
        return max;
    }
}
