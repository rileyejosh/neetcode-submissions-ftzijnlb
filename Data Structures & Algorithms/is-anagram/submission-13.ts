class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {

        const sMap = new Map();
        const tMap = new Map();

        if(s.length != t.length) return false;
        
        for(let c of s) {
            sMap.set(c, (sMap.get(c) || 0) + 1);
        }

        for(let c of t) {
            tMap.set(c, (tMap.get(c) || 0) + 1);
        }

        for(let c of t) {
            if(!sMap.has(c)) return false;
            if(sMap.get(c) != tMap.get(c)) return false;
        }

        return true;                                                                                 

    }


}
