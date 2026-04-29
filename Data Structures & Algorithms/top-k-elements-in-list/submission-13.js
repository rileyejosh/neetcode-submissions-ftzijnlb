class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const res = [];
        const freqMap = new Map();

        for(let i = 0; i < nums.length; i++) {
            let n = nums[i];
            if(freqMap.has(n)) {
                freqMap.set(n, freqMap.get(n)+1);
            } else {
                freqMap.set(n, 1);
            }
        }
        const sortedMap = new Map([...freqMap].sort((a, b) => b[1] - a[1]));
        for(const [num, freq] of sortedMap) {
            if(res.length == k) break;
            res.push(num);
        }


        return res;

    }
}
