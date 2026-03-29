class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        int l = 0;
        int r = 0;
        for( r = 0; r < s.length(); r++) {

            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0)+1);
            while(map.get(c) > 1) {
                char d = s.charAt(l);
                map.put(d, map.get(d) -1);
                if(map.get(d) <= 0)
                    map.remove(d);
                l++;
            }
            

            len = Math.max(len, r - l+1);
            
        }
        return len;

    }
}
