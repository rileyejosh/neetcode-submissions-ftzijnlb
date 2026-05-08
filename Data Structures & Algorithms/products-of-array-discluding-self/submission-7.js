class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        const results = new Array(nums.length);
        const pre = new Array(nums.length);
        const suf = new Array(nums.length);
        pre[0] = 1;
        let prod = nums[0];
        for(let i = 1; i < nums.length; i++) {
            pre[i] = prod;
            prod *= nums[i];
        }
        suf.fill(1);
        prod = 1;
        suf[nums.length-1] = nums[nums.length-1];
        for(let i = nums.length-1; i >= 0; i--) {
            suf[i] = prod;
            prod *= nums[i];
        }

        for(let i = 0; i < results.length; i++) {
            results[i] = pre[i] * suf[i];
        }

        return results;
    }
}
