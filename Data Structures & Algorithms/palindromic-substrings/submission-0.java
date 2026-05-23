class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            ans+= isPalin(s, i, i);
            ans+= isPalin(s, i, i+1);
        }
        return ans;
    }

    private static int isPalin(String s, int start, int end){
        int count = 0;
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }
}
