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
        for e in entries:
            if e[1] == timestamp:
                return e[0]
            if e[1] < timestamp:
                val = e[0]
        return val 


        
