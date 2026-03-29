class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        arrivals = []
        stack = []
        for i in range(len(position)):
            arrivals.append([position[i], (target-position[i])/speed[i]])
        arrivals.sort(key=lambda a: a[0])
        for i in range(len(arrivals)-1, -1, -1):
            if not stack:
                stack.append(arrivals[i][1])
                continue
            if stack[-1] < arrivals[i][1]:
                stack.append(arrivals[i][1])
        return len(stack)