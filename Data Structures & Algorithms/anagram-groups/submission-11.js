class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        
        const res = new Set();
        // create map of sorted strings in from str
        for(let str1 of strs) {
            const m1 = new Map();
            let matches = [];
            for(let i = 0; i < str1.length; i++) {
                if(m1.has(str1[i]))
                    m1.set(str1[i], m1.get(str1[i])+1);
                else
                    m1.set(str1[i], 1);
            }
            
            for(let str2 of strs) {
                const m2 = new Map();
                if(str1.length != str2.length) continue;
                for(let i = 0; i < str2.length; i++) {
                    if(m2.has(str2[i]))
                        m2.set(str2[i], m2.get(str2[i])+1);
                    else
                        m2.set(str2[i], 1);
               }
                // JS requires the this keyword to point the 
                // engine to the current instance's properties and methods
                if(this.areMapsEqual(m1, m2)) { 

                    matches.push(str2);
                }
            }
            // In JavaScript, a Set does not automatically check for "deep" equality of arrays. 
            //It only checks for referential equality
            res.add(JSON.stringify(matches));

            
           
        }
        //  parse arrys back from strings
        return Array.from(res).map(s => JSON.parse(s));;

    }

    areMapsEqual(map1, map2) {
        if(map1.size !== map2.size) return false;
        const m1Keys = map1.keys();
        const m2Keys = map2.keys();
        for(let key of m1Keys) {
            if(!map2.has(key)) return false;
            if(map2.get(key) != map1.get(key)) return false;
        }
        for(let key of m2Keys) {
            if(!map1.has(key)) return false;
            if(map2.get(key) != map1.get(key)) return false;
        }

        return true;
    }
}
