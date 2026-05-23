class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left_max = new int[len]; 
        int[] right_max = new int[len];

        left_max[0] = height[0];
        right_max[len-1] = height[len-1];

        for(int i = 1; i < len; i++){
            left_max[i] = Math.max(left_max[i-1],height[i]);
        }
        for(int i = len-2; i >= 0; i--){
            right_max[i] = Math.max(right_max[i+1],height[i]);
        }
        int trap = 0;
        for(int i = 0; i < len; i++){
            int h = Math.min(left_max[i], right_max[i]);
            trap+=h-height[i];
        }
        return trap;
    }
}
