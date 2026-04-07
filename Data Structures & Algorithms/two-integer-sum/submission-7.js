class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const res = [];
        const num_map = new Map();
        for(let i = 0; i < nums.length; i++) {
            if(num_map.has(target - nums[i]) && i != num_map.get(target-nums[i])) {
                res[0] = i;
                res[1] = num_map.get(target-nums[i]);
            }
            num_map.set(nums[i], i);


        }
        return res;
    }
}
