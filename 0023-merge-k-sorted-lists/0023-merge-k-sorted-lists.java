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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> res = new  PriorityQueue<>();
        for(ListNode list:lists){
            while(list!=null){
                res.add(list.val);
                list=list.next;
            }
        }
        ListNode newlist =new ListNode(0);
        ListNode current=newlist;
        while(!res.isEmpty()){
            current.next=new ListNode(res.poll());
            current=current.next;
        }
        return newlist.next;
    }
}