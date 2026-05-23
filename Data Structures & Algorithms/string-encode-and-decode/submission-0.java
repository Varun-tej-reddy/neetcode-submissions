class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();

        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;

        while( i < str.length()){
            int j = i;

            while(str.charAt(j) != '#') j++;

            int len = Integer.parseInt(str.substring(i,j));
            j++;

            list.add(str.substring(j,j+len));

            i = j+len;
        }
        return list;
    }
}
