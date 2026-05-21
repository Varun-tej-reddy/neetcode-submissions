class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        par(n,list,0,0,"");
        return list;
    }

    private static void par(int n, List<String> list, int open, int close, String s){
        if(s.length() == 2*n){
            list.add(s);
            return;
        }

        if(open < n){
            par(n,list,open+1,close,s+"(");
        }

        if(close < open){
            par(n,list,open,close+1,s+")");
        }
    }
}
