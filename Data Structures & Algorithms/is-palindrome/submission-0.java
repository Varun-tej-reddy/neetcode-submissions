class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ans+=(Character.toLowerCase(c));
            }
        }
        int i = 0;
        while(i < ans.length()){
            if(ans.charAt(i) != ans.charAt(ans.length() -i -1)) return false;
            i++;
        }
        return true;
    }
}
