class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        boolean warmer = false;
        for(int i = 0; i < temperatures.length; i++) {
            for(int j = i +1; j < temperatures.length; j++) {
                if(temperatures[i] < temperatures[j]) {
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;

    }
}
