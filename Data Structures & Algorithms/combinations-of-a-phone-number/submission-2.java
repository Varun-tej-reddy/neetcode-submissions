class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> list = new ArrayList<>();
        if(digits == null || digits.length() == 0) return list;

        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        letterComb(digits,list,map,"",0);
        return list;
    }

    private static void letterComb(String digits, List<String> list, HashMap<Integer, String> map, String combination, int ind){
        if(ind == digits.length()){
            list.add(combination);
            return;
        }

        String letters = map.get(digits.charAt(ind) - '0');
        for(char letter : letters.toCharArray()){
            letterComb(digits,list,map,combination+letter,ind+1);
        }
    }
}
