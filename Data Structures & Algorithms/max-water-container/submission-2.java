class Solution {
    public int maxArea(int[] heights) {
        int N = heights.length;
        int area = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i +1; j < N; j++) {
                area = Math.max(area, ((j-i) * Math.min(heights[i], heights[j])));
            }

        }
        return area;
    }
}
