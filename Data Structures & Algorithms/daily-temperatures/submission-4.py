class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        result = [0 for _ in range(len(temperatures))]

        stack.append([temperatures[0], 0])

        for i in range(1, len(temperatures)):
            temp = temperatures[i]
            while stack and temp > stack[-1][0]:
                prev_temp = stack.pop()
                result[prev_temp[1]] = i - prev_temp[1]
            stack.append([temp, i])
        return result
        