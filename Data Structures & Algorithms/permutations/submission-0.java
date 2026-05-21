class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        per(nums,list,0);
        return list;
    }

    private static void per(int[] nums, List<List<Integer>> list, int i){
        if(i == nums.length){
            ArrayList<Integer>l = new ArrayList<>();
            for(int j : nums) l.add(j);
            list.add(l);
            return;
        }

        for(int ind = i; ind < nums.length; ind++){
            swap(nums, ind, i);
            per(nums,list,i+1);
            swap(nums,ind,i);
        }


    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
