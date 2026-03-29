class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int N = intervals.length;
        List<int[]> res = new ArrayList<>();
        for(int i = 0; i < N; i++ ) {
            if(newInterval[1] < intervals[i][0]) {
                res.add(newInterval);
                // add remaining intervals starting from index i
                for (int j = i; j < N; j++) {
                    res.add(intervals[j]);
                }
                return convertListToArray(res);
            
            } else if(intervals[i][1] < newInterval[0]) {   
                res.add(intervals[i]);
            } else {
                newInterval = new int[] {
                    Math.min(newInterval[0], intervals[i][0] ),
                    Math.max(newInterval[1], intervals[i][1])
                    };
            }
        }
        res.add(newInterval);
        return convertListToArray(res);

    }

    public static int[][] convertListToArray(List<int[]> listOfIntArrays) {
        if (listOfIntArrays == null || listOfIntArrays.isEmpty()) {
            return new int[0][0]; // Return an empty 2D array if the list is empty or null
        }

        // Determine dimensions
        int numRows = listOfIntArrays.size();
        int numCols = listOfIntArrays.get(0).length; // Assuming all inner arrays have the same length

        // Create the 2D array
        int[][] result = new int[numRows][numCols];

        // Copy elements
        for (int i = 0; i < numRows; i++) {
            result[i] = listOfIntArrays.get(i); // Assign the entire int[] directly
        }

        return result;
    }
}
