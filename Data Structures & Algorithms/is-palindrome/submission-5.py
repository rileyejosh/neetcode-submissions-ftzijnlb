class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1

        # edge cases:
        # lower and upper case letters
        # spaces

        while l < r:
            if not s[r].isalnum():
                r-=1
            elif not s[l].isalnum():
                l+=1
            elif s[l].lower() != s[r].lower():
                return False  
            else:
                l+=1
                r-=1

        return True

        