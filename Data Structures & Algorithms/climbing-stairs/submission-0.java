class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        return climb(n, 0, cache);

    }

    public int climb(int n, int i, Map<Integer, Integer> cache) {

        if(i >= n) return i == n ? 1 : 0;
        
        if(cache.containsKey(i)) return cache.get(i);

        cache.put(i, climb(n, i+1, cache) + climb(n, i+2, cache));

        return cache.get(i);

    }
}
