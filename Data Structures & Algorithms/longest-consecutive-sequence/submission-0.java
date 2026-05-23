class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int count = 1;
        int long_count = 1;
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        for(int num : nums){
            set.add(num);
        }
        ArrayList <Integer> list = new ArrayList<>(set);

        for(int i = 1; i < list.size(); i++){
            int a = list.get(i-1);
            int b = list.get(i);
            if(b - a == 1) count++;
            else count = 1;

            long_count = Math.max(long_count, count);
        }
        return long_count;
    }
}
