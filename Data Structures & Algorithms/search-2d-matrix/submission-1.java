class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
       for(int i = 0; i < matrix.length; i++ )  {
        int lo = 0;
        int hi = matrix[i].length-1;
        int j = 0;
        while(lo <= hi) {
            int mid = (hi + lo)/2;
            if(target > matrix[i][mid])
                lo = mid + 1;
            else if(target < matrix[i][mid])
                hi = mid - 1;
            else
                return true;
        }

       }
       return false;
    }
}
