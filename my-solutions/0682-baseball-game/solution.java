import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int l = st.pop();
                int sl = st.peek();
                int sc = l + sl;
                st.push(l);
                st.push(sc);
            } else if (op.equals("D")) {
                st.push(st.peek()*2);
            } else if (op.equals("C")) {
                st.pop();
            } else{
                st.push(Integer.parseInt(op));
            }
        }
        int t = 0;
        for (int score:st) {
            t+=score;
        }
        return t;
    }
}

