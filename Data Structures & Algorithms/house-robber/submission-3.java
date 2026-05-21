class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);

        return helper(nums,dp,nums.length-1);
    }
    private static int helper(int[] nums, int[] dp, int n){
        if(n < 0) return 0;
        if( n == 0) return nums[0];

        if(dp[n] != -1) return dp[n];

        int a = nums[n] + helper(nums,dp,n-2);
        int b = helper(nums,dp,n-1);

        dp[n] = Math.max(a,b);
        return dp[n];
    }
}
