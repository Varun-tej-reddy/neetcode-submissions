class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        if(s.length() == 1) return s;

        String ans = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String check = s.substring(i,j);
                if(isPalendrome(check,0,check.length()-1) && check.length() > ans.length()) {
                    ans = check;
                }
            }
        }
        return ans;
    }

    private static boolean isPalendrome(String check, int i, int j){
        while(i < j){
            if(check.charAt(i++) != check.charAt(j--)) return false;
        }
        return true;
    }
}
