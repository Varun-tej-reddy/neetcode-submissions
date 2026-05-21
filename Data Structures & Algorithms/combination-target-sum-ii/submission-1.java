class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        sumset(candidates,list,0,target,new ArrayList<Integer>());
        return list;
    }

    private static void sumset(int[] candidates, List<List<Integer>> list, int i, int target, ArrayList<Integer> l){
        if(i == candidates.length){
            if(target == 0){
                list.add(new ArrayList<>(l));
            }
            return;
        }

        if(target >= candidates[i]){
            l.add(candidates[i]);
            sumset(candidates,list,i+1,target-candidates[i],l);
            l.remove(l.size() -1);
        }
        int next = i+1;
        while(next < candidates.length && candidates[next] == candidates[i]) next++;
        sumset(candidates,list,next,target,l);
    }
}
