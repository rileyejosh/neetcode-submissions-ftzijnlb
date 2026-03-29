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
    public ListNode reverseList(ListNode head) {
       ListNode reverse = null;
       
       ListNode curr = head;
       
       while(curr != null) {
        
        ListNode second = curr.next;
        curr.next = reverse;
        reverse = curr;
        curr = second;

       }
 
       return reverse; 
    }
}
