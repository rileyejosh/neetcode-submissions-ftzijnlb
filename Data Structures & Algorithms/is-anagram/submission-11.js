class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;

        const sMap = new Map();
        const tMap = new Map();

        for(let c of s) {
            if(sMap.has(c))
                sMap.set(c, sMap.get(c)+1);
            else
                sMap.set(c, 1);
        }

        for(let c of t) {
            if(tMap.has(c)) {
                tMap.set(c, tMap.get(c)+1);
            } else
                tMap.set(c, 1);
        }

        for(let c of s ) {
            if(!tMap.has(c)) return false;
            if(tMap.get(c) != sMap.get(c)) return false;
        }



        return true;

        
        
        
        
    }
}
