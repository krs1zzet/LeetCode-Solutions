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
    public ListNode deleteMiddle(ListNode head) {
        int i = 0;
        ListNode prev = null;
        ListNode curr = null;

        ListNode temp = head;

        while (temp != null) {
            i++;
            temp = temp.next;
        }

        i /=2;

        


        ListNode temp1 = head;

        for (int j = 0; j < i - 1; j++) {
            temp1 = temp1.next;
        }
        prev = temp1;
        prev.next = prev.next.next;

        return head;

    }
}