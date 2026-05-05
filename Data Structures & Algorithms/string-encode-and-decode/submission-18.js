class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let res = "";
        for(let str of strs) {
            res += "" + str.length + "#" + str;
        }
        return res;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        const results = [];
        let i = 0;
        while(i < str.length) {
            let j = i;
            while(str[j] !== "#") {
                j++;
            }    
            let len = Number(str.substring(i, j));
            let subStr = str.substring(j+1, len + 1 + j); 
            results.push(subStr);
            i = len + 1 + j;

        }
        return results;
    }
}
