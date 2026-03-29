class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference)) {
               int index = map.get(difference);
               if(i > index) {
                list.add(index);
                list.add(i);
               } else {
                list.add(i);
                list.add(index);
               }
            } else {
                map.put(nums[i], i);
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for(int n : list) {
            res[i] = n;
            i++;
        }   
        return res; 
    }
}
