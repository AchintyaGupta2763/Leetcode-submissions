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
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack<ListNode>st = new Stack<>();
        ListNode itr = slow.next;
        slow.next = null;

        while(itr!=null){
            st.push(itr);
            itr = itr.next;
        }
        ListNode curr = head;
        ListNode temp = head;
        while(!st.isEmpty()){
            ListNode node = st.pop();
            temp = curr.next;
            curr.next = node;
            node.next = temp;
            curr = temp;
        }        
    }
}
