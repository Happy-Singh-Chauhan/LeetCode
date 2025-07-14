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
    public int findLength(ListNode head){
        int len=1;
        while(head.next != null){
            len++;
            head=head.next;
        }
        return len;
    }
    public int getDecimalValue(ListNode head) {
        int len=findLength(head);
        int ans=0;
        while(head.next != null){
            if(head.val == 1){
                ans+=Math.pow(2,len-1);
            }
            head=head.next;
            len--;
        }
        if(head.val == 1)ans++;
        return ans;
    }
}