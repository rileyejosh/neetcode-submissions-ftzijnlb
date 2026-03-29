class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "");
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        int lo = 0;
        int hi = s.length()-1;
        while(lo < hi) {
            if(!Character.isLetterOrDigit(s.charAt(lo)))
                lo++;
            else if(!Character.isLetterOrDigit(s.charAt(hi)))
                hi--;
            else {
                if((s.charAt(lo)) != s.charAt(hi))
                    return false;
                lo++;
                hi--;
            }

            
        }
        return true;
    }
}
