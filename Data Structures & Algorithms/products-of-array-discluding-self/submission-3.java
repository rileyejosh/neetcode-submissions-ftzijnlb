class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int prod = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) prod *= nums[j]; 
            }
            map.put(nums[i], prod);
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < res.length; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
     }
}  
