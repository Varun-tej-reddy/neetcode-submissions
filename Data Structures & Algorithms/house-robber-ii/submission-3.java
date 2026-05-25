class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int a = house(0,nums.length-2,nums);
        int b = house(1,nums.length-1,nums);
        return Math.max(a,b);
    }
    private static int house(int start, int end, int[] nums){
        int prev1 = nums[start];
        int prev2 = 0;
        
        for(int i = start+1; i <= end; i++){
            int take = nums[i];
            if(i - start > 1) take+=prev2;
            int not_take = prev1;

            int curr = Math.max(take, not_take);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

}
