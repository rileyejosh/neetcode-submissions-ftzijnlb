class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        # brute force
        result = [0 for _ in range((len(temperatures)))]
        for i in range(len(temperatures)):
            c = 0
            for j in range(i+1, len(temperatures)):
                c+=1
                if temperatures[i] < temperatures[j]:
                    result[i] = c
                    break
        
        return result



