class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const res = [];
        const freqMap = new Map();
        let cap = 0;

        for(let i = 0; i < nums.length; i++) {
            let n = nums[i];
            if(freqMap.has(n)) {
                freqMap.set(n, freqMap.get(n)+1);
            } else {
                freqMap.set(n, 1);
            }
        }

        for(const [num, freq] of freqMap.entries()) {
            if(res.length < k) {
                res.push(num);
                continue;
            } 
            let minIdx = -1;
            let minFreq = Infinity;
            for(let i = 0; i < res.length; i++) {
                 let curFreq = freqMap.get(res[i]);
                 if(curFreq < minFreq) {
                    minIdx = i;
                    minFreq = curFreq;
                 }
            }
            if(freq > minFreq)
                res[minIdx] = num;
        }

        return res;

    }
}
