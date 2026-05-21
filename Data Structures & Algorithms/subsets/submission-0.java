class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(nums,list,0,new ArrayList<Integer>());
        return list;
    }
    private static void subset(int[] nums, List<List<Integer>> list, int i, ArrayList<Integer> l){
        if(i == nums.length){
            list.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[i]);
        subset(nums,list,i+1,l);
        l.remove(l.size() -1);

        subset(nums,list,i+1,l);
    }
}
