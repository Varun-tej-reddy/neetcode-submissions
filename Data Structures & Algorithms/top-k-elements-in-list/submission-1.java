class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        List<Integer> list = new ArrayList<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        pq.addAll(map.keySet());

        for(int i = 0; i < k; i++){
            list.add(pq.poll());
        }

        int[] arr = new int[list.size()];
        for( int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
