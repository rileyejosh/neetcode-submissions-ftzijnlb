class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> temp = new ArrayList<>();
        for(int n : nums) {
            temp.add(n);
        }
        Collections.sort(temp, Comparator.reverseOrder());
        System.out.println(temp.toString());
        int i = 0;
        int res = 0;
        while(i < k){

            res = temp.get(i);
            i++;

        }
        return res;
    }
}
