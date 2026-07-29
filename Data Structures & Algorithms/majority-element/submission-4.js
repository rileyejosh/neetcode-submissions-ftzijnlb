class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        const counts = new Map();
        const uniqueNums = new Set();
        let res = nums[0];
        for(let n of nums) {
            uniqueNums.add(n);
            counts.set(n, (counts.get(n) || 0) + 1);
        }

        for(let n of uniqueNums) {
            if(counts.get(n) > (nums.length/2))
                res = n;
        }

        return res;

    }
}
