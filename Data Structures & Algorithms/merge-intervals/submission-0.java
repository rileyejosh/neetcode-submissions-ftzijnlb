class Solution {
    public int[][] merge(int[][] intervals) {
        
        // Sort 2D array by first element in the
        // inner arrays
        Arrays.sort(intervals, (i1,i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> merged = new ArrayList<>();

        merged.add(intervals[0]);
        int N = intervals.length;
        // If A.end < B.start, intervals don't overlap
        // If A.end >= B.start, intervals overlap
        for(int[] B : intervals) {
            int[] A = merged.get(merged.size()-1);
            if(A[1] < B[0])
                // B starts after A
                merged.add(B);
            else {
                // merged A with B
                merged.set(merged.size()-1, new int[]{A[0], Math.max(A[1], B[1])});
            }
        }
        int[][] mergedRes = new int[merged.size()][2];
        for(int i = 0; i < merged.size(); i++) {
            mergedRes[i] = merged.get(i);
        }
        return mergedRes;


        
    }


}
