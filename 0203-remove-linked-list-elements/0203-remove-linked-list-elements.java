class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode d=new ListNode(0, head);
        ListNode p=d;
        while(p.next!=null) {
            if(p.next.val==val) p.next=p.next.next;
            else p = p.next;
        }
        return d.next;
    }
}
