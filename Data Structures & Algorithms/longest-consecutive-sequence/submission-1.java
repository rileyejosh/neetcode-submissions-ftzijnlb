class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = 0;
        int max = 0;
        for(int n : nums) {
            set.add(n);
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i]-1)) {
                int num = nums[i];
                while(set.contains(num++)) {
                    len++;
                }
            }
            max = Math.max(len, max);
            len = 0;
        }

        return max;
    }
}