class Solution {
    public boolean canJump(int[] nums) {
       int dest = nums.length-1;
       
       // starting from the end of the array
       for(int i = nums.length-2; i >= 0; i--) {
         int prevDest = i + nums[i];
         System.out.println(prevDest);
         if(prevDest >= dest) 
            dest = i;
        
       }


       return dest <= 0 ? true : false;
    }
}
