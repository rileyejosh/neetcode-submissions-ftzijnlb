class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs: string[]): string[][] {
    const groups = new Map();
    for(const s of strs) {
        let conanical = new Array(26).fill(0);
        // O(1) operation
        for(const c of s) {
            conanical[c.charCodeAt(0) - 'a'.charCodeAt(0)]++;
        }
        if(!groups.has(conanical.toString())) {
            groups.set(conanical.toString(), []);
        }
        groups.get(conanical.toString()).push(s);
    }
    return Array.from(groups.values());
    }
}
