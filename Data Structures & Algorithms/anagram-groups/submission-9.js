class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const wordMap = new Map();
        const res = new Array();
        for(let str of strs) {
            let temp = Array.from(str);
            temp.sort();
            let sortedStr = temp.join("");
            wordMap.set(sortedStr, []);
           
        }

        for(let str of strs) {
            let temp = Array.from(str);
            temp.sort();
            let sortedStr = temp.join("");
            const arr = wordMap.get(sortedStr);
            arr.push(str);
            wordMap.set(sortedStr, arr);
        }

        for(const val of wordMap.values()) {
            res.push(val);
        }

        return res;

    }
}
