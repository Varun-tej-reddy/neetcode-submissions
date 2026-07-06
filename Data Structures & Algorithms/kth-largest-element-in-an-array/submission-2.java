class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            if(a == b) return 0;
            return b - a;
        });
        for(int i : nums){
            pq.add(i);
        }
        while(k > 1){
            pq.poll();
            k--;
        }
        return pq.peek();
        /*
        Arrays.sort(nums);
        return nums[nums.length-k];
        */
    }
}
