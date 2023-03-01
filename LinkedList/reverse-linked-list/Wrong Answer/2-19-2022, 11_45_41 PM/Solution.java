// https://leetcode.com/problems/reverse-linked-list

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
        
        if(head == null){
            return null;
        }
        ListNode prev = new ListNode();
        prev = null;
        while(head != null){
            ListNode next = new ListNode();
            next = head.next;
            head.next = prev;
            prev = head;
            head = head.next;
        }
        
        return prev;
    }
}