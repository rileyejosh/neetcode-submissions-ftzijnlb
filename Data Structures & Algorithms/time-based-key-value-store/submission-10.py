class TimeMap:

    def __init__(self):
        self.hm = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        entry = [value, timestamp]
        if key not in self.hm:
            self.hm[key] = []          
        self.hm[key].append(entry)

    def get(self, key: str, timestamp: int) -> str:
        val = ""
        if key not in self.hm:
            return val
        entries = self.hm[key]
        l = 0
        r = len(entries)-1
        while l <= r:
            m = (l+r)//2
            if entries[m][1] == timestamp:
                return entries[m][0]
            elif entries[m][1] < timestamp:
                l = m + 1
                val = entries[m][0]
            else:
                r = m - 1
        return val 


        
