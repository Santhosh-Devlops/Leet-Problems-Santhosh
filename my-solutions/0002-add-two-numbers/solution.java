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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }
        ListNode dummy=null;
        ListNode curr=null;
        String n1="",n2="";
        while(l1!=null){
            n1+=String.valueOf(l1.val);
            l1=l1.next;
        }
        
        String s1=new StringBuilder(n1).reverse().toString();

        while(l2!=null){
            n2+=String.valueOf(l2.val);
            l2=l2.next;
        }
        String s2=new StringBuilder(n2).reverse().toString();
        
        BigInteger o1=new BigInteger(s1);
        BigInteger o2=new BigInteger(s2);
        BigInteger sum=o1.add(o2);
        if (sum.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }

        while(!sum.equals(BigInteger.ZERO)){
            BigInteger[] dr=sum.divideAndRemainder(BigInteger.TEN); 
            int r=dr[1].intValue();
            sum=dr[0];
            if(dummy==null) {
                dummy=new ListNode(r);
                curr=dummy;
            }
            else{
                ListNode ne=new ListNode(r);
                curr.next=ne;
                curr=ne;
            }
            
        }
        return dummy;
    }
}

