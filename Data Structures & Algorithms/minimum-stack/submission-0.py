class MinStack:

    # monotonically decreasing stack should be used
    # use inner list that takes constant space:
        # the first element should be the val inserted
        # the second element should be the minimum element of the stack

    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        if len(self.stack) == 0:
            self.stack.append([val, val])
            return
        min_val = self.stack[-1][1]
        if min_val > val:
            self.stack.append([val, val])
        else:
            self.stack.append([val, min_val])

    def pop(self) -> None:
        return self.stack.pop()
        

    def top(self) -> int:
        return self.stack[-1][0]
        

    def getMin(self) -> int:
        return self.stack[-1][1]
        
