class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs: string[]): string[][] {
        const groups = new Map();
        for(const s of strs) {
            let sortedStr: string = [...s].sort().join('');
            if(!groups.has(sortedStr)) {
                groups.set(sortedStr, []);
            }
        }
        for(const s of strs) {
            let sortedStr: string = [...s].sort().join('');
            groups.get(sortedStr).push(s);
        }
        return Array.from(groups.values());
    }
}
