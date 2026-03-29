class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char t : tasks) {
            freqMap.put(t, freqMap.getOrDefault(t, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.offer(entry.getValue());
        }
        Queue<int[]> q = new LinkedList<>();

        while(!pq.isEmpty() || !q.isEmpty()) {
            
            time++;
            while(!q.isEmpty() && q.peek()[1] == time) {
                pq.offer(q.poll()[0]);
            }
            if(!pq.isEmpty()) {
                int freq = pq.poll()-1;
                if(freq > 0) {
                    q.add(new int[]{freq, time+n+1});
                }
            }
        }

        return time;


    }
}
