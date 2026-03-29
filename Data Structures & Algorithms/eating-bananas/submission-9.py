class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
      l = 1
      r = max(piles) 
      k = r # assume minimum k is the highest rate

      while l <= r:
        cur_hours = 0
        m = (l+r)//2
        for p in piles:
            cur_hours += math.ceil(p/m)
        # hours for this rate is within the threshold, 
        # so no need to include rates after it 
        # since they will not help to converge to minimum k
        if cur_hours <= h: 
          r = m-1 # therefore the rate before it becomes the maximum
          k = m # mid rate becomes the new minimum
        else:
          l = m + 1 # increase the rate since it exceeds the threshold
                    # this will help in converging to minimum k when
                    # calculating the mid rate
      return k
        

