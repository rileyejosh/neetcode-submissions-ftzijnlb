class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      int remove = 0;
      Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
      int A = intervals[0][1];
      for( int i = 1; i < intervals.length; i++ ) {
        int[] B = intervals[i];

        // if B.start begins after A.end ends
        // then B will become A, which will be considered
        // to determine subsequent non-overlapping intervals
        if(A <= B[0])
            A = B[1];
        else {
            // A and B overlap, so we must remove
            // the interval that ends last
            remove+=1;
            A = Math.min(A, B[1]);
        }

      }

      return remove;  
    }
}
