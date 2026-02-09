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
    public int pairSum(ListNode head) {
        List <Integer> list = new ArrayList<>();
        ListNode temp = head;
        int num = 0;
        int max = 0;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        for (int i = 0; i < n / 2; i++){
            num = list.get(i) + list.get(n-i-1);
            max = Math.max(num,max);
        }
        return max;
        
    }
        
    
}