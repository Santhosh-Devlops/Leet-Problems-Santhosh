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
    public ListNode insertionSortList(ListNode head) {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int[] arr=new int[cnt];
        int k=0;
        temp=head;
        while(temp!=null){
            arr[k++]=temp.val;
            temp=temp.next;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>arr[j-1]){
                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        ListNode ans=new ListNode(0);
        ListNode c=ans;
        for(int i=arr.length-1;i>=0;i--){
            c.next=new ListNode(arr[i]);
            c=c.next;
        }
        return ans.next;
        
    }
}
