class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones) {
            maxHeap.offer(s);
        }

        while(maxHeap.size() > 1) {
            int f = maxHeap.poll();
            int s = maxHeap.poll();
            maxHeap.offer(f-s);

        }
        return maxHeap.size() > 0 ? maxHeap.poll() : 0; 

    }
}
