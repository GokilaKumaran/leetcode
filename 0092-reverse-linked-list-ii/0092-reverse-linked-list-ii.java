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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||left==right) return head;
        ListNode list=new ListNode(0);
        list.next=head;
        ListNode prev=list;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode next=null;
        ListNode ps=null;
        for(int i=0;i<=right-left;i++){
            next=curr.next;
            curr.next=ps;
            ps=curr;
            curr=next;
        }
        prev.next.next=curr;
        prev.next=ps;
        return list.next;
    }
}