class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        const s = new Set();
        if(nums.length == 0) return 0;
        for(let n of nums) {
            s.add(n);
        }

        let min = Math.min(...nums); 
        let temp = min;
        let count = 1;
        while(s.has(temp+1)) {
            count++;
            temp++;
        }
        let maxCount = count;
        s.delete(min);
        count = 1;
        for(let cur of s) {
            while(s.has(cur+1)) {
                cur++;
                count++;
            }
            maxCount = Math.max(maxCount, count);
            count = 1;

        }
        maxCount = Math.max(maxCount, count);
        return maxCount;

    }
}
