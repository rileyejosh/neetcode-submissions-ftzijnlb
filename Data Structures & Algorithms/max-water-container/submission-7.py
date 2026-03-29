class Solution:
    def maxArea(self, heights: List[int]) -> int:
       """
       min(height[left], height[right]) * (right - left). 
       This formula multiplies the height of the shorter 
       of the two vertical lines 
       by the horizontal distance between them
       """ 
       # optimized: two pointers - inward traversal 
       l = 0
       r = len(heights) - 1
       area = 0
       while l < r:
        # get the max area of the current container
        area = max(area, min(heights[l], heights[r]) * (r - l))

        # if the left bar is less than right bar
        # then the water will spill over
        # so shift right to the next bar
        if heights[l] < heights[r]:
            l+=1
        else:
            # otherwise shift
            r-=1


       return area




        