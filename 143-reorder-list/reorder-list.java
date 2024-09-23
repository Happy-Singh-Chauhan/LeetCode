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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        ListNode lastNode=head;
        while(lastNode.next != null && lastNode.next.next != null){
            lastNode=lastNode.next;
        }
        ListNode nextNode=head.next;
        head.next=lastNode.next;
        lastNode.next=null;
        reorderList(nextNode);
        head.next.next=nextNode;
    }
}