class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const res = [];
        for(let i = 0; i < nums.length; i++) {
            for(let j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }

        }
        return res;
    }
}
