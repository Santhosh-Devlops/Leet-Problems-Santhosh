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
import java.util.ArrayList;
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        List<?> r=new ArrayList<>(l);
        Collections.reverse(r);
        if(l.equals(r)){
            return true;
        }
        return false;
        
    }
}