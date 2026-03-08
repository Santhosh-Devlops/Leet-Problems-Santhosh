/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs=new HashSet<>();
        ListNode c=head;
        while(c!=null){
            if(hs.contains(c)){
                return true;
            }
            hs.add(c);
            c=c.next;
        }
        return false;
    }
}