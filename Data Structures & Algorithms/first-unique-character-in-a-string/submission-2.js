class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    firstUniqChar(s) {
        const counts = new Map();

        for(let c of s) {
            
            counts.set(c, (counts.get(c) || 0) + 1);
        }

        for(let i = 0; i < s.length; i++) {
            let c = s[i];
            if(counts.get(c) == 1) 
                return i;
        }

        return -1;
    }
}
