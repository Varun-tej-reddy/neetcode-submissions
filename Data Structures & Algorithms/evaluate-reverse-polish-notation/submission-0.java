class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int a = 0, b = 0;
        for(String i : tokens){
            if(i.equals("+")){
                a = st.pop();
                b = st.pop();
                st.push(b+a);
            }
            else if(i.equals("*")){
                a = st.pop();
                b = st.pop();
                st.push(b*a);
            }
            else if(i.equals("-")){
                a = st.pop();
                b = st.pop();
                st.push(b-a);
            }
            else if(i.equals("/")){
                a = st.pop();
                b = st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.pop();
    }
}
