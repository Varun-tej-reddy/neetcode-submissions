class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] a1 = s.toCharArray();
            Arrays.sort(a1);

            String s1 = new String(a1);

            if(!map.containsKey(s1)){
                map.put(s1, new ArrayList<>());
            }
            map.get(s1).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
