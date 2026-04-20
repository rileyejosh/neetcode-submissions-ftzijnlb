class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {// O(n *klogk)
        const strMap = new Map();
        const results = new Array();
        for(let str of strs) { // O(n)
            let temp = Array.from(str);
            temp.sort();
            let sortedStr = temp.join("");
            if(!strMap.has(sortedStr)) {
                strMap.set(sortedStr, new Array());
                strMap.get(sortedStr)
                      .push(str);
            } else {
                strMap.get(sortedStr).push(str);
            }
        }
        for(let e of strMap.values()) {
            results.push(e);
        }

        return results;


    }
}
