class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        s = new String(a1);
        t = new String(a2);

        return s.equals(t);
    }
}
