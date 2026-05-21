class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int n = nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        int a = helper1(nums,dp,n-1);

        Arrays.fill(dp,-1);
        int b = helper2(nums,dp,n-2);

        return Math.max(a,b);
    }

    private static int helper1(int[] nums, int[] dp, int n){
        if(n <= 0) return 0;

        if(dp[n] != -1) return dp[n];

        int a = nums[n] + helper1(nums,dp,n-2);
        int b = helper1(nums,dp,n-1);

        dp[n] = Math.max(a,b);
        return dp[n];
    }


    private static int helper2(int[] nums, int[] dp, int n){
        if(n < 0) return 0;
        if(n == 0) return nums[0];

        if(dp[n] != -1) return dp[n];

        int a = nums[n] + helper2(nums,dp,n-2);
        int b = helper2(nums,dp,n-1);

        dp[n] = Math.max(a,b);
        return dp[n];
    }
}
