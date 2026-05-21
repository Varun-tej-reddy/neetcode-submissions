class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        sumset(nums,list,0,new ArrayList<Integer>());
        return list;
    }

    private static void sumset(int[] nums, List<List<Integer>> list, int i, ArrayList<Integer> l){
        if(i == nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
            

        l.add(nums[i]);
        sumset(nums,list,i+1,l);
        l.remove(l.size() -1);

        int next = i+1;
        while(next < nums.length && nums[next] == nums[i]) next++;
        sumset(nums,list,next,l);
    }
}

