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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(n==count) return head.next;
        int target = count - n - 1;
        int traverse = 0;
        ListNode temp2 = head;
        while(traverse!=target && temp2!=null){
            temp2 = temp2.next;
            traverse++;
        }
        temp2.next = temp2.next.next;

        return head;
    }
}
