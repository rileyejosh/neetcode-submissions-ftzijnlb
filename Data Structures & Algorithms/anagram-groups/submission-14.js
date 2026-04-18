class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        
        const res = [];
        // create map of sorted strings in from str
        for(let k = 0; k < strs.length; k++) {
            const m1 = new Map();
            let str1 = strs[k];
            let matches = [];
            for(let i = 0; i < str1.length; i++) {
                if(m1.has(str1[i]))
                    m1.set(str1[i], m1.get(str1[i])+1);
                else
                    m1.set(str1[i], 1);
            }
            matches.push(str1);
            
            for(let j = 0; j < strs.length; j++) {
                let str2 = strs[j];
                if(str1.length != str2.length) continue;
                if(k == j) continue;
                const m2 = new Map();
                for(let i = 0; i < str2.length; i++) {
                    if(m2.has(str2[i]))
                        m2.set(str2[i], m2.get(str2[i])+1);
                    else
                        m2.set(str2[i], 1);
               }
                // JS requires the this keyword to point the 
                // engine to the current instance's properties and methods
                if(this.areMapsEqual(m1, m2)) { 
                    matches.push(str2)
                }
            }
            let present = false;
            for(let arr of res) {
                if(this.areArraysEqual(arr, matches)) {
                    present = true;
                    break;
                }
            }
            if(!present) {
                    res.push(matches);
            }
           
        }
        return res

    }
    areArraysEqual(arr1, arr2) {

        if (arr1.length !== arr2.length) return false;
        const counts = {};
        for (const x of arr1) counts[x] = (counts[x] || 0) + 1;
        for (const x of arr2) {
            if (!counts[x]) return false;
            counts[x]--;
        }
        return true;

    }
    areMapsEqual(map1, map2) {
        if(map1.size !== map2.size) return false;
        const m1Keys = map1.keys();
        for(let key of m1Keys) {
            if(!map2.has(key)) return false;
            if(map2.get(key) != map1.get(key)) return false;
        }

        return true;
    }
}
