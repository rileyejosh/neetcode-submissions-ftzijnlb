class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {// O(n *klogk)
        const strMap = new Map();

        for(let str of strs) { // O(n)

            const sortedStr = str.split('').sort().join(''); // O(klogk)
            if(!strMap.has(sortedStr)) {
                strMap.set(sortedStr, []);
            }
            strMap.get(sortedStr).push(str);
        }

        return Array.from(strMap.values());


    }
}
