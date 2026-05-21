class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        sumset(nums,list,0,target,new ArrayList<Integer>());
        return list;
    }

    private static void sumset(int[] nums, List<List<Integer>> list, int i, int target, ArrayList<Integer> l){
        if(i == nums.length){
            if(target == 0){
                list.add(new ArrayList<>(l));
            }
            return;
        }

        if(target >= nums[i]){
            l.add(nums[i]);
            sumset(nums,list,i,target-nums[i],l);
            l.remove(l.size() -1);
        }

        sumset(nums,list,i+1,target,l);
    }

}
