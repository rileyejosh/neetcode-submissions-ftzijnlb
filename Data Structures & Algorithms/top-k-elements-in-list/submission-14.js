

class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const counts = new Map();

        for(let n of nums) {
            counts.set(n, (counts.get(n) || 0) + 1);
        }


        const minHeap = new MinPriorityQueue(
         (item) => item[0]
        );


        for(const [key, val] of counts) {
            minHeap.enqueue([val, key]);
            // keep k highest-freq elements
            if(minHeap.size() > k) {
                minHeap.dequeue();
            }
        }

        const res = [];
        while(!minHeap.isEmpty()) {
            res.push(minHeap.dequeue()[1]);
        }

        return res;


    }
}
