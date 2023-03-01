// https://leetcode.com/problems/reorder-list

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
        
      
        //If there is one node or two nodes only
        if(head.next == null || head.next.next == null) return;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //slow points to the mid node. So we want to reverse the linked list after mid
        ListNode reverseList = reverse(slow.next);
        slow.next = null;

        ListNode pointer1 = head;
        ListNode pointer2 = reverseList;
 
        //Now all that's left is connecting the nodes properly
        while(pointer2 != null){
            ListNode next1 = pointer1.next;
            ListNode next2  = pointer2.next;
            
            pointer1.next = pointer2;
            pointer1 = next1;

            pointer2.next = pointer1;
            pointer2 = next2;            
        }
        }
    }
}