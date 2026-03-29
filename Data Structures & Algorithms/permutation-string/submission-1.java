class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int k = s1.length();
        
        // Build frequency arrays
        for (int i = 0; i < k; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        
        // Check first window
        if (arraysEqual(count1, count2)) return true;
        
        // Slide window
        for (int R = k; R < s2.length(); R++) {
            count2[s2.charAt(R) - 'a']++;
            count2[s2.charAt(R - k) - 'a']--;
            if (arraysEqual(count1, count2)) return true;
        }
        
        return false;
    }
    
    private boolean arraysEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}