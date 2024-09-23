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
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode next=current.next;
        while(current != null){
            current.next=prev;
            prev=current;
            current=next;
            if(next != null){
                next=next.next;
            }
        }
        return prev;
    }
    public ListNode middleList(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleList(head);
        ListNode headSecond=reverseList(mid);
        ListNode rereverseHead=headSecond;
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(rereverseHead);
        return head == null || headSecond == null;
    }
}