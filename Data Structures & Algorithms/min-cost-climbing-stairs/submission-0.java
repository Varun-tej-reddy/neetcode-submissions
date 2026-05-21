class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);

        return Math.min(helper(cost,dp,cost.length-1), helper(cost,dp,cost.length-2));
    }

    private static int helper(int[] cost, int[] dp, int n){
        if(n == 0 || n == 1) return cost[n];

        if(dp[n] != -1) return dp[n];

        dp[n] = cost[n] +Math.min(helper(cost,dp,n-1) , helper(cost,dp,n-2));
        return dp[n];
    }
}
