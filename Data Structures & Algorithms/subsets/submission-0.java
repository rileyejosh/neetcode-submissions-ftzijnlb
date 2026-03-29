class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        List<Integer> curSet = new ArrayList<>();
        helper(0, nums, curSet, sets);
        return sets;
    }

    private void helper(int index, int[] nums, List<Integer> curSet, List<List<Integer>> sets) {
        
        if(index >= nums.length) {
            sets.add(new ArrayList<>(curSet));
            return;
        }
        curSet.add(nums[index]);
        helper(index+1, nums, curSet, sets);
        curSet.remove(curSet.size()-1);
        
        helper(index+1, nums, curSet, sets);

    }

}
