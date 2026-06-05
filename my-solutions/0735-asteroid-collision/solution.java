class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<>();
        int k=0;
        for(int i=0;i<a.length;i++){
            int l=a[i];
            while(!st.isEmpty() && st.peek()>0 && l<0){
                if(st.peek()<-l){
                    st.pop();
                }
                else if(st.peek()==-l){
                    st.pop();
                    l=0;
                    break;
                }
                else{
                    l=0;
                    break;
                }
            }
            if(l!=0){
                st.push(l);
            }
        }
        int[] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}
