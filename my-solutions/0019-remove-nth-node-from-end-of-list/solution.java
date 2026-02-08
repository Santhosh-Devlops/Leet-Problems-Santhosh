/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int[] arr=new int[101];
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        ListNode m=new ListNode(0);
        ListNode c=m;
        int k=i-n;
        int j=0;
        while(j<i){
            if(j!=k){
                c.next=new ListNode(arr[j]);
                c=c.next;
            } 
            j++;         
        }
        return m.next;
    }
}
