class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {// O(n * k)
        const strMap = new Map();
        
        for(let str of strs) { // O(n)
            let freqArr = new Array(26).fill(0);
            for(let i = 0; i < str.length; i++ ) { // O(k)
                freqArr[str.charCodeAt(i) - 'a'.charCodeAt(0)]+=1;
            }
            let arrStr = JSON.stringify(freqArr);
            if(!strMap.has(arrStr)) {
                strMap.set(arrStr, []);
            }
            strMap.get(arrStr).push(str);
        }

        return Array.from(strMap.values());


    }
}
