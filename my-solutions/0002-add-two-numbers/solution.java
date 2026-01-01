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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode c = l1;
        ListNode c1 = l2;

        ListNode head = new ListNode(0);
        ListNode temp = head;

        int carry = 0;

        while (c != null || c1 != null) {

            int v1 = (c != null) ? c.val : 0;
            int v2 = (c1 != null) ? c1.val : 0;

            int sum = v1 + v2 + carry;
            carry = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if (c != null) c = c.next;
            if (c1 != null) c1 = c1.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return head.next;
    }
}

