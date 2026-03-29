

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies using HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Build TreeMap where key = frequency, value = list of numbers with that frequency
        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            treeMap.putIfAbsent(freq, new ArrayList<>());
            treeMap.get(freq).add(num);
        }

        // Step 3: Walk from highest frequency down, collect top k elements
        List<Integer> result = new ArrayList<>();
        for (Integer freq : treeMap.descendingKeySet()) {
            for (int num : treeMap.get(freq)) {
                if (result.size() == k) break;
                result.add(num);
            }
            if (result.size() == k) break;
        }

        // Convert list to array
        int[] resArray = new int[k];
        for (int i = 0; i < k; i++) {
            resArray[i] = result.get(i);
        }

        return resArray;
    }
}
