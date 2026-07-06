class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            if(a == b) return a;
            return b - a;
        });
        for(int i : nums){
            pq.add(i);
        }
        while(k != 0){
            pq.poll();
        }
        return pq.poll();
        */
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
