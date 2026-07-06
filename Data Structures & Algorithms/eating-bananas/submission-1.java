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
//always find max element to get the equal amount of hours for which k value total hours == h;
//binary search min val = 1(min eating rate per hour) max is max piles
//binary search time with mid and see or check which is appropiate 