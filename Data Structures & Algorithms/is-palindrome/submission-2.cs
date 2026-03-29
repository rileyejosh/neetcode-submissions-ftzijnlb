public class Solution {
    public bool IsPalindrome(string s) {
        string newStr = "";
        foreach (char c in s) {
            if (char.IsLetterOrDigit(c)) {
                newStr += char.ToLower(c);
            }
        }        
        int L = 0;
        int R = newStr.Length-1;
        while(L < R) {
            if(newStr[L] != newStr[R])
            {

                return false;
            }
            L++;
            R--;
        }   
        return true;
    }
}
