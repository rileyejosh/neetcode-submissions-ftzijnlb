class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = new char[26];
        char[] c2 = new char[26];

        if(s1.length() > s2.length()) return false;
        int k = s1.length();
        for(int i = 0; i < k; i++) {
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }
        if(equals(c1, c2)) return true;
        for(int i = k; i < s2.length(); i++) {
            c2[s2.charAt(i) - 'a']++;
            c2[s2.charAt(i-k) - 'a']--;
            if(equals(c1, c2)) return true;
        }

        return false;
        
    }

    private boolean equals(char[] c1, char[] c2) {

        for(int i = 0; i < 26; i++) {
            if(c1[i] != c2[i]) return false;
        }

        return true;
    }
}
