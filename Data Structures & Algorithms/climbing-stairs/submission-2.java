class Solution {
    public int climbStairs(int n) {
        //Map<Integer, Integer> cache = new HashMap<>();
        // return climbMemo(n, 0, cache);
        
        if(n <= 2) return n;
        int[] cache = new int[2];
        cache[0] = 1;
        cache[1] = 2;
        int i = 3;
        while(i <= n) {
            int tmp = cache[1];
            cache[1] = cache[0] + cache[1];
            cache[0] = tmp; 
            i++;
        }
        return cache[1];
    }
 
    // public int climbMemo(int n, int i, Map<Integer, Integer> cache) {

    //     if(i >= n) return i == n ? 1 : 0;
        
    //     if(cache.containsKey(i)) return cache.get(i);

    //     cache.put(i, climb(n, i+1, cache) + climb(n, i+2, cache));

    //     return cache.get(i);

    // }
}
