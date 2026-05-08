class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        const n = nums.length;
        const results = new Array(n);
        const pre = new Array(n);
        const suf = new Array(n);
        
        pre[0] = 1;
        let prod = nums[0];
        for(let i = 1; i < n; i++) {
            pre[i] = prod;
            prod *= nums[i];
        }
        suf.fill(1);
        prod = 1;
        suf[n-1] = nums[n-1];
        for(let i = n-1; i >= 0; i--) {
            suf[i] = prod;
            prod *= nums[i];
        }

        for(let i = 0; i < n; i++) {
            results[i] = pre[i] * suf[i];
        }

        return results;
    }
}
