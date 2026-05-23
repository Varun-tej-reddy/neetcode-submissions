class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length <= 1) return nums;

        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;

        for(int i = 1; i < n; i++){
            prefix[i] = nums[i-1]*prefix[i-1];
        }

        int sufix = 1;

        for(int i = n-2; i >= 0; i--){
            sufix *= nums[i+1];
            prefix[i] *= sufix;
        }
        return prefix;
    }
}  
