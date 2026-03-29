class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++ ) {
            int num = nums[i];
            
            for(int lo =i+1, hi = nums.length-1; lo < hi;) {
                int sum = num + nums[lo] + nums[hi];
                if(sum > 0)
                    hi--;
                else if(sum < 0)
                    lo++;
                else {
                    if(!results.contains(Arrays.asList(num, nums[lo], nums[hi])))
                        results.add(Arrays.asList(num, nums[lo], nums[hi]));        
                    lo++;
                    hi--;
                }
            }
            
        }


        return results;
    }
}
