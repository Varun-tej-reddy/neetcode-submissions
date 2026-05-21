class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        comb(s,list,0,new ArrayList<String>());
        return list;
    }

    private static void comb(String s, List<List<String>> list, int i, ArrayList<String> l){
        if(i == s.length()){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int ind = i; ind < s.length(); ind++){
            if(isPalin(s,i,ind)){
                l.add(s.substring(i,ind+1));
                comb(s,list,ind+1,l);
                l.remove(l.size()-1);
            }
        }

    }

    private static boolean isPalin(String s, int start, int end){
        
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
