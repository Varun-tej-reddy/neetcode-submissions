class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int i : piles) right = Math.max(i, right);

        while(left <= right){
            int hr = left + (right - left)/2;
            int val = 0;
            for(int i : piles){
                val+=(i+hr-1)/hr;
            }

            if(val<=h)right = hr-1;
            else left = hr +1;
        }

        return left;
    }
}
