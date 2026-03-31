class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;
        const sArray = Array.from(s);
        const tArray = Array.from(t);
        sArray.sort();
        tArray.sort();

        if(sArray.join() === tArray.join()) return true;

        return false;

        
        
        
        
    }
}
