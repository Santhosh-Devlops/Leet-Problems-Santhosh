class MyStack {
    private Queue<Integer> q=new LinkedList<>();
    private Queue<Integer> q2=new LinkedList<>();
    public MyStack() {

    }
    
    public void push(int x) {
        q2.add(x);
        while(!q.isEmpty()){
            q2.add(q.remove());
        }

        Queue<Integer> t=q;
        q=q2;
        q2=t;
        System.out.println(q2);
    }
    
    public int pop() {
        if(q.isEmpty()){
            return 0;
        }
        else{
            return q.poll();
        }
    }
    
    public int top() {
        if(q.size()>=1){
            return q.peek();
        }
        else{
            return 0;
        }
    }
    
    public boolean empty() {
        if(q.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
