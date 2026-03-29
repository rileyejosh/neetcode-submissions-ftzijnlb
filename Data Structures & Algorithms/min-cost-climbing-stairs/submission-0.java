class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(dfs(cost, 0), dfs(cost, 1));
    }

    private int dfs(int[] cost, int i) {

        if( i >= cost.length ) return 0;

        if(i == cost.length-1) return cost[i] + dfs(cost, i+1);

        return Math.min(cost[i] + dfs(cost, i+1), cost[i] + dfs(cost, i+2));

    }
}
