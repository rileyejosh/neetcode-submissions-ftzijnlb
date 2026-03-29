class Solution {
    public int maxArea(int[] heights) {
        int N = heights.length;
        int area = 0;
        int l = 0;
        int r = N-1;
        while(l < r) {
        
            area = Math.max(area, ((r-l) * Math.min(heights[l], heights[r])));
            if(heights[l] < heights[r])
                l++;
            else
                r--;

        }
        return area;
    }
}
