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
    public ListNode mergeTwoLists(ListNode lilst1, ListNode list2) {
        if(lilst1!=null && list2!=null){
        if(lilst1.val<list2.val){
            lilst1.next=mergeTwoLists(lilst1.next,list2);
            return lilst1;
            }
            else{
                list2.next=mergeTwoLists(lilst1,list2.next);
                return list2;
        }
        }
        if(lilst1==null)
            return list2;
        return lilst1;
    }
}
