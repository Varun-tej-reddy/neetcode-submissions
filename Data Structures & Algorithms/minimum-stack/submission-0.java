class MinStack {
    static int min = Integer.MAX_VALUE;
    private Stack<Integer> st;
    private Stack<Integer> min_st;

    public MinStack() {
        st = new Stack<>();
        min_st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min_st.isEmpty() || val <= min_st.peek())min_st.push(val);
    }
    
    public void pop() {
        if(st.isEmpty())return;
        int top = st.pop();
        if(min_st.peek() == top)min_st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min_st.peek();
    }
}
