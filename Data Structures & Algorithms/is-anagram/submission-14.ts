class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {

        const sMap = new Array(256).fill(0);
        const tMap = new Array(256).fill(0);

        if(s.length != t.length) return false;
        
        for(let c of s) {
            sMap[c.charCodeAt(0)]++;
        }

        for(let c of t) {
            tMap[c.charCodeAt(0)]++;
        }

        for(let c of t) {
            if(sMap[c.charCodeAt(0)] == 0) return false;
            if(sMap[c.charCodeAt(0)] != tMap[c.charCodeAt(0)]) return false;
        }

        return true;                                                                                 

    }


}
