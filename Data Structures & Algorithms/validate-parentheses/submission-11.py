class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        # edge case: input length not even
        if len(s) % 2 != 0:
            return False

        for i in s:
            if i == ")":
                if not stack or stack.pop() != "(":
                    return False
            elif i == "]":
                if not stack or stack.pop() != "[":
                    return False
            elif i == "}":
                if not stack or stack.pop() != "{":
                    return False
            else:
                stack.append(i) 
        # edge case: stack may not be empty at end of loop
        # ternary: value_if_true if condition else value_if_false
        return True if not stack else False


        