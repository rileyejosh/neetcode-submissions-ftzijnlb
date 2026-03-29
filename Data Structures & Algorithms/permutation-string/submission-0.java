class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        // Build frequency map for s1
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        
        int k = s1.length();
        // Initialize the first window
        for (int R = 0; R < k; R++) {
            char c = s2.charAt(R);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        
        // Check the first window
        if (map1.equals(map2)) return true;
        
        // Slide the window
        for (int R = k; R < s2.length(); R++) {
            // Add new character at R
            char newChar = s2.charAt(R);
            map2.put(newChar, map2.getOrDefault(newChar, 0) + 1);
            
            // Remove character at L
            int L = R - k;
            char oldChar = s2.charAt(L);
            map2.put(oldChar, map2.get(oldChar) - 1);
            if (map2.get(oldChar) == 0) {
                map2.remove(oldChar);
            }
            
            // Check if current window matches
            if (map1.equals(map2)) return true;
        }
        
        return false;
    }
}