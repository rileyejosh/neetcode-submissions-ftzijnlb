class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        int i = 1;
        for(int n : nums) {
            maxHeap.offer(n);
        }
        while(maxHeap.size() > 0 && i < k) {
            maxHeap.poll();
            i++;
        }
        
        return maxHeap.peek();

    }
}
